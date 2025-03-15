/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.pojo;

/**
 *
 * @author rj851
 */
public class UserPojo {
    private String username;
    private String useremail;
    private String mobile;
    private String addrss;
    private int pincode;
    private String password; 
    
    
    public UserPojo() {
    }

    public UserPojo(String username, String useremail, String mobile, String addrss, int pincode, String password) {
        this.username = username;
        this.useremail = useremail;
        this.mobile = mobile;
        this.addrss = addrss;
        this.pincode = pincode;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddrss() {
        return addrss;
    }

    public void setAddrss(String addrss) {
        this.addrss = addrss;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserPojo{" + "username=" + username + ", useremail=" + useremail + ", mobile=" + mobile + ", addrss=" + addrss + ", pincode=" + pincode + ", password=" + password + '}';
    }
    
}
