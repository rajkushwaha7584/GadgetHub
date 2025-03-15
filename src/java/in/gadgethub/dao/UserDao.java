/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.dao;

import in.gadgethub.pojo.UserPojo;

/**
 *
 * @author rj851
 */
public interface UserDao {
    String registerUser(UserPojo user);
    boolean isRegistered(String emailId);
    String isValidCredential(String emailId,String password);
    UserPojo getUserDetail(String emailId);
    String getUserFirstName(String email);
    String getUserAddr(String emailId);
    
}
