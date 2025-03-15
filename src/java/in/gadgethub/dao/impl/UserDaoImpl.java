/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.dao.impl;

import in.gadgethub.dao.UserDao;
import in.gadgethub.pojo.UserPojo;
import in.gadgethub.utility.DBUtil;
import in.gadgethub.utility.MailMessage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.UIManager;

/**
 *
 * @author rj851
 */
public class UserDaoImpl implements UserDao{
    
//    Check user is Registered of not ?
    public boolean isRegistered(String emailId){
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection conn=DBUtil.provideConnection();
        boolean flag=false;
         try {
            ps=conn.prepareStatement("Select 1 from users where useremail=?");
            ps.setString(1,emailId);
            rs=ps.executeQuery();
            if (rs.next()) {
                flag=true;
            }
        } catch (Exception ex) {
            System.out.println("Error in isRegestration"+ex);
            ex.printStackTrace();
        }
        DBUtil.closeResultSet(rs);
        DBUtil.closeStatement(ps);
        return flag;
    }
//    ==========================================================
//        if User is not Regestered then user can Regester here
    
    public String registerUser(UserPojo user){
        String status="Regestration Failed";
        boolean isUserRegistered=isRegistered(user.getUseremail());
        if (isUserRegistered) {
            status="Email Already Registered. Try again";
            return status;
        }
        Connection conn=DBUtil.provideConnection();
        PreparedStatement ps=null;
        try {
            ps=conn.prepareStatement("Insert into users values(?,?,?,?,?,?)");
            ps.setString(1, user.getUseremail());
            ps.setString(2, user.getUsername());
            ps.setString(3, user.getMobile());
            ps.setString(4, user.getAddrss());
            ps.setInt(5, user.getPincode());
            ps.setString(6, user.getPassword());
            int count =ps.executeUpdate();
            if(count==1){
                status="Regestration successfull";
                MailMessage.registrationSuccess(user.getUseremail(),user.getUsername());
            }
        } catch (Exception ex) {
            System.out.println("Error in RegisterUser"+ex);
            ex.printStackTrace();
        }
        DBUtil.closeStatement(ps);
        return status;
    }
//    ==========================================================
//   LOgin formate
   
    public String isValidCredential(String emailId,String password){
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection conn=DBUtil.provideConnection();
        String status="Login Denied. Inveled UserName and Password";
        try {
            ps=conn.prepareStatement("Select 1 from users where username=? and password=?");
            ps.setString(1,emailId);
            ps.setString(2,password);
            rs=ps.executeQuery();
            if (rs.next()) {
            status="Login Successfull";
            }
        } catch (Exception ex) {
            status="Error"+ex.getMessage();
            System.out.println("Error in isValidCredential"+ex.getMessage());
            ex.printStackTrace();
        }
        DBUtil.closeResultSet(rs);
        DBUtil.closeStatement(ps);
        return status;
    }
//    ==========================================================
//   Return details of user 
    
    public UserPojo getUserDetail(String emailId) {
        UserPojo user =null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection conn=DBUtil.provideConnection();
        try {
            ps=conn.prepareStatement("Select * from users where useremail=?");
            ps.setString(1,emailId);
            rs=ps.executeQuery();  
            if (rs.next()) {
                user=new UserPojo();
                user.setUseremail(rs.getString("useremail"));
                user.setUsername(rs.getString("username"));
                user.setMobile(rs.getString("mobile"));
                user.setAddrss(rs.getString("address"));
                user.setPincode(rs.getInt("pincode"));
                user.setPassword(rs.getString("password"));
            }
        } catch (Exception ex) {
            System.out.println("Error in getUserDetail"+ex);
            ex.printStackTrace();
        }
        DBUtil.closeResultSet(rs);
        DBUtil.closeStatement(ps);
        return user;
    }
//    ========================================================== 
//    show user first name
   
    public String getUserFirstName(String emailId){
         String fname="";
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection conn=DBUtil.provideConnection();
        try {
            ps=conn.prepareStatement("Select username from users where useremail=?");
            ps.setString(1,emailId);
            rs=ps.executeQuery();  
            if (rs.next()) {
               String fullName=rs.getString(1);
               fname=fullName.split(" ")[0];
            }
        } catch (Exception ex) {
            System.out.println("Error in getUserDetail"+ex);
            ex.printStackTrace();
        }
        DBUtil.closeResultSet(rs);
        DBUtil.closeStatement(ps);
        return fname;
    }
//    ========================================================== 
//    to show address of user
   
    public String getUserAddr(String emailId){
         String address="";
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection conn=DBUtil.provideConnection();
        try {
            ps=conn.prepareStatement("Select address from users where useremail=?");
            ps.setString(1,emailId);
            rs=ps.executeQuery();  
            if (rs.next()) {
                address=rs.getString(1);
            }
        } catch (Exception ex) {
            System.out.println("Error in getUserDetail"+ex);
            ex.printStackTrace();
        }
        DBUtil.closeResultSet(rs);
        DBUtil.closeStatement(ps);
        return address;
    }
//    ==========================================================     
}
