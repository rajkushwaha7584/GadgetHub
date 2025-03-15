/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.dao.impl;

import in.gadgethub.dao.CartDao;
import in.gadgethub.pojo.CartPojo;
import in.gadgethub.pojo.Demandpojo;
import in.gadgethub.utility.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rj851
 */
public class CartDaoImpl implements CartDao{

    @Override
    public String addProductToCart(CartPojo cart) {
        String status="failed To Add To Cart";  
        Connection conn=DBUtil.provideConnection();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            ps=conn.prepareStatement("Select * from USERCART where prodid=? and useremail=?");
            ps.setString(1, cart.getProdId());
            ps.setString(2, cart.getUseremail());
            rs=ps.executeQuery();
            if (rs.next()) {
                ProductDaoImpl productDao=new ProductDaoImpl();
                int stockQty=productDao.getProductQuantity(cart.getProdId());
                int newQty=cart.getQuantity()+rs.getInt("quantity");
                if(stockQty<newQty){
                    
                }else{
                    cart.setQuantity(newQty);
                    updateProductInCart(cart);
                    status="Only "+stockQty+" number of item are avalable in our stock so we are adding "+stockQty+" in your cart";
                    
                    Demandpojo demandpojo=new Demandpojo();
                    demandpojo.setProdId(cart.getProdId());
                    demandpojo.setUseremail(cart.getUseremail());
                    demandpojo.setDemandquantity(newQty-stockQty);
                    
                    DemandDaoImpl demandDao=new DemandDaoImpl();
                    boolean result=demandDao.addProduct(demandpojo);
                    if (result==true) {
                        status="We will mail you when "+(newQty-stockQty)+" number of iten will be available";
                    }
                }
            }
        } catch (Exception ex) {
            status="Addetition Failed Due to Exception";
            System.out.println("Error in addProductToCart:"+ex);
            ex.printStackTrace();
        }
        DBUtil.closeResultSet(rs);
        DBUtil.closeStatement(ps);
        return status;
    }
//==================================================================================================================================
   
    @Override
    public String updateProductInCart(CartPojo cart) {
        Connection conn=DBUtil.provideConnection();
        PreparedStatement ps1=null;
        PreparedStatement ps2=null;
        ResultSet rs=null;
        int ans=0;
        String status="failed To Add Into Cart";
        try {
            ps1=conn.prepareStatement("Select * from USERCART where prodid=? and useremail=?");
            ps1.setString(1, cart.getProdId());
            ps1.setString(2, cart.getUseremail());
            rs=ps1.executeQuery();
            if (rs.next()) {
                int qty=cart.getQuantity();
                if (qty>0) {
                    ps2=conn.prepareStatement("update USERCART set quantity=? where useremail=? and prodid=?");
                    ps2.setInt(1, cart.getQuantity());
                    ps2.setString(2, cart.getUseremail());
                    ps2.setString(3, cart.getProdId());
                } else if(qty==0){
                    ps2=conn.prepareStatement("Delete from USERCART  where useremail=? and prodid=?");
                    ps2.setString(1, cart.getUseremail());
                    ps2.setString(2, cart.getProdId());
                    ans=ps2.executeUpdate();
                    if(ans>0){
                        status="Product Successfully updated into cart";
                    }else{
                        status="Could Not Update The Product";
                    }
                }
            }else{
                ps2=conn.prepareStatement("insert into USERCART values (?,?,?)");
                ps2.setString(1, cart.getUseremail());
                ps2.setString(2, cart.getProdId());
                ps2.setInt(3, cart.getQuantity());
                ans=ps2.executeUpdate();
                if(ans>0){
                    status="Product Successfully added into cart";
                }else{
                        status="Could Not Add The Product";
                    }
            }
        } catch (Exception ex) {
            status="Updatation Failed Due to Exception";
            System.out.println("Error in updateProductInCart:"+ex);
            ex.printStackTrace();
        }
        DBUtil.closeResultSet(rs);
        DBUtil.closeStatement(ps1);
        DBUtil.closeStatement(ps2);
        return status;
    }
//==================================================================================================================================
   
    @Override
    public List<CartPojo> getAllCartItems(String userId) {
        List <CartPojo> itemList=new ArrayList<>();
        Connection conn=DBUtil.provideConnection();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            ps=conn.prepareStatement("Select * from USERCART where useremail=?");
            ps.setString(1, userId);
            rs=ps.executeQuery();
            while (rs.next()) {                
                CartPojo cart=new CartPojo();
                cart.setUseremail(rs.getString("useremail"));
                cart.setProdId(rs.getString("userid"));
                cart.setQuantity(rs.getInt("quantity"));
                itemList.add(cart);
            }
        } catch (Exception ex) {
            System.out.println("Error in getAllCartItems:"+ex);
            ex.printStackTrace();
        }
        DBUtil.closeResultSet(rs);
        DBUtil.closeStatement(ps);
        return itemList;
    }
//==================================================================================================================================
   
    @Override
    public int getCartItemCount(String userId, String itemId) {
        if (userId==null||itemId==null) {
            return 0;
        }
        int count=0;
        Connection conn=DBUtil.provideConnection();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            ps=conn.prepareStatement("Select quantity from USERCART where useremail=? and prodid=?");
            ps.setString(1, userId);
            ps.setString(2, itemId );
            rs=ps.executeQuery();
            if (rs.next()) {
                count=rs.getInt(1);
            }
        } catch (Exception ex) {
            System.out.println("Error in getAllCartItems:"+ex);
            ex.printStackTrace();
        }
        DBUtil.closeResultSet(rs);
        DBUtil.closeStatement(ps);
        return count;
    }
//==================================================================================================================================
   
    @Override
     public String removeProductFromCart(String userId, String prodId) {
        String status="failed Removed Failed";  
        Connection conn=DBUtil.provideConnection();
        PreparedStatement ps1=null;
        PreparedStatement ps2=null;
        ResultSet rs=null;
        try {
            ps1=conn.prepareStatement("Select * from USERCART where prodid=? and useremail=?");
            ps1.setString(1, prodId);
            ps1.setString(2, userId);
            rs=ps1.executeQuery();
            if (rs.next()) {
                int prodQuantity=rs.getInt("quantity");
                prodQuantity-=1;
                if(prodQuantity>0){
                    ps2=conn.prepareStatement("Update USERCART set quantity =? where useremail=? and prodid=?");
                    ps2.setInt(1, prodQuantity);
                    ps2.setString(2, userId);
                    ps2.setString(3, prodId);
                    int k=ps2.executeUpdate();
                    if(k>0){
                        status="Product successfull removed from the cart";
                    }
                 }else{
                    ps2=conn.prepareStatement("Delete from USERCART where useremail=? and prodid=?");
                    ps2.setString(1, userId);
                    ps2.setString(2, prodId);
                    int k=ps2.executeUpdate();
                    if(k>0){
                        status="Product sucessfull Deleted from the cart";
                   }
                }
            } 
        }catch (Exception ex) {
            status="Removal Failed Due to Exception";
            System.out.println("Error in removeProductFromCart: "+ex);
            ex.printStackTrace();
        }
        DBUtil.closeResultSet(rs);
        DBUtil.closeStatement(ps1);
        DBUtil.closeStatement(ps2);
        return status;
     }
//==================================================================================================================================
    
     @Override
    public Boolean removeAProduct(String userId, String prodId) {
         boolean status=false;
         Connection conn=DBUtil.provideConnection();
         PreparedStatement ps=null;
         try {
            ps=conn.prepareStatement("Delect from USERCART where useremail=? and userid=?");
            ps.setString(1, userId);
            ps.setString(2, prodId);
            int k=ps.executeUpdate();
            if(k>0){
                status=true; 
            }
         } catch (Exception ex) {
            System.out.println("Error in removeAProduct:"+ex);
            ex.printStackTrace();
        }
        DBUtil.closeStatement(ps);
        return status;
     }
    } 
//==================================================================================================================================