/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.dao.impl;

import in.gadgethub.dao.TransactionDao;
import in.gadgethub.utility.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author rj851
 */
public class TransactionDaoImpl implements TransactionDao{

    @Override
    public String getUserId(String trandId) {
        String userId="";
        Connection conn=DBUtil.provideConnection();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            ps=conn.prepareStatement("Select * from transaction where transid=?");
            ps.setString(1, trandId);
            rs=ps.executeQuery();
            if (rs.next()) {
                userId=rs.getString(1);
            }
        } catch (Exception ex) {
            System.out.println("Error in TransactionDaoImpl:"+ex);
            ex.printStackTrace();
        }
        DBUtil.closeStatement(ps);
        DBUtil.closeResultSet(rs);
        return userId;
    }
    
}
