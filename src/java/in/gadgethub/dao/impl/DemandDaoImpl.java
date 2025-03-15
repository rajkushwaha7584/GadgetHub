/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.dao.impl;

import in.gadgethub.dao.DemandDAO;
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
public class DemandDaoImpl implements DemandDAO{

    @Override
    public Boolean addProduct(Demandpojo demandPojo) {
        boolean status=false;
        String updateSQL="Update userdemand set quantity=? where useremail=? and prodid=?";
        String insertSQL="Insert into userdemand values(?,?,?)";
        Connection conn=DBUtil.provideConnection();
        PreparedStatement ps1=null;
        PreparedStatement ps2=null;
        try {
            ps1=conn.prepareStatement(updateSQL);
            ps1.setInt(1, demandPojo.getDemandquantity());
            ps1.setString(2, demandPojo.getUseremail());
            ps1.setString(3, demandPojo.getProdId());
            int k=ps1.executeUpdate();
            if(k==0){
                ps2=conn.prepareStatement(insertSQL);
                ps2.setString(1, demandPojo.getUseremail());
                ps2.setString(2, demandPojo.getProdId());
                ps2.setInt(3, demandPojo.getDemandquantity());
                ps2.executeUpdate();
                
            }
            status =true;
        } catch (Exception ex) {
            System.out.println("Error in addProduct:"+ex);
            ex.printStackTrace();
        }
        DBUtil.closeStatement(ps1);
        DBUtil.closeStatement(ps2);
        return status;
    }
//=======================================================================================================
    @Override
    public Boolean removeProduct(String userId, String prodId) {
      boolean result=false;
      Connection conn=DBUtil.provideConnection();
      PreparedStatement ps=null;
        try {
            ps=conn.prepareStatement("delete from userdemand where useremail=? and prodid=?");
            ps.setString(1, userId);
            ps.setString(2, prodId);
            result=ps.executeUpdate()>0;
        } catch (Exception ex) {
            System.out.println("Error in removeProduct:"+ex);
            ex.printStackTrace();
        }
        DBUtil.closeStatement(ps);
        return result;
    }
//=======================================================================================================
    @Override
    public List<Demandpojo> haveDemanded(String prodId) {
        List<Demandpojo>demandList=new ArrayList<>();
        Connection conn=DBUtil.provideConnection();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            ps=conn.prepareStatement("Select * from userdemand where prodid=?");
            ps.setString(1, prodId);
            rs=ps.executeQuery();
            while (rs.next()) {
                Demandpojo demandpojo=new Demandpojo();
                demandpojo.setUseremail(rs.getString("useremail"));
                demandpojo.setProdId(rs.getString("prodid"));
                demandpojo.setDemandquantity(rs.getInt("quantity"));
            }
        } catch (Exception ex) {
            System.out.println("Error in haveDemanded:"+ex);
            ex.printStackTrace();
        }
        DBUtil.closeResultSet(rs);
        DBUtil.closeStatement(ps);
        return demandList;
    }

}
