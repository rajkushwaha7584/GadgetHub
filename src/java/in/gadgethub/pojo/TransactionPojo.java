/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.pojo;

import java.util.Date;

/**
 *
 * @author rj851
 */
public class TransactionPojo {
    private String transactionId;
    private String userEmail;
    private Date transTime;
    private double ampunt;

    public TransactionPojo() {
    }

    public TransactionPojo(String transactionId, String userEmail, Date transTime, double ampunt) {
        this.transactionId = transactionId;
        this.userEmail = userEmail;
        this.transTime = transTime;
        this.ampunt = ampunt;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Date getTransTime() {
        return transTime;
    }

    public void setTransTime(Date transTime) {
        this.transTime = transTime;
    }

    public double getAmpunt() {
        return ampunt;
    }

    public void setAmpunt(double ampunt) {
        this.ampunt = ampunt;
    }

        
    @Override
    public String toString() {
        return "TransactionPojo{" + "transactionId=" + transactionId + ", userEmail=" + userEmail + ", transTime=" + transTime + ", amount=" + ampunt + '}';
    }
    
    
}
