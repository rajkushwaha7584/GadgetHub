/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author rj851
 */
public class DBUtil {
    private static Connection conn;
//    Opening Connection
    public static void openConnection(String dbUrl,String username,String password) {
        if(conn==null){
            try {
                conn=DriverManager.getConnection(dbUrl,username,password);
                System.out.println("GadgetHub Connection opened");
            } catch (Exception ex) {
                System.out.println("Error in opening connection");
                ex.printStackTrace();
            }
        }
    }
    
//    Closing connection
    public static void closeConnection(){
        if (conn!=null) {
            try {
                conn.close();
                System.out.println("Connection closed");
            } catch (Exception ex) {
                System.out.println("Error in closing connection");
                ex.printStackTrace();
            }
        }
    }
    
//    Return Connection
    public static Connection provideConnection(){
        return conn;
    }
    
//    Close ResultSet
    public static void closeResultSet(ResultSet rs){
        if(rs!=null){
            try {
                rs.close();
                System.out.println("ResultSet Close");
            } catch (SQLException ex) {
                System.out.println("Error in closing RsultSet");
                ex.printStackTrace();
            }
        }
    }
    public static void closeStatement(Statement st){
        if(st!=null){
            try {
                 st.close();
              } catch (Exception xe) {
                  System.out.println("Error in closing Statment"+xe);
                  xe.printStackTrace();
            }
        }
    }    
}
