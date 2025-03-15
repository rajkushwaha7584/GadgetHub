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
public class Demandpojo {
    private String useremail;
    private String prodId;
    private int demandquantity;

    public Demandpojo() {
    }

    public Demandpojo(String useremail, String prodId, int demandquantity) {
        this.useremail = useremail;
        this.prodId = prodId;
        this.demandquantity = demandquantity;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public int getDemandquantity() {
        return demandquantity;
    }

    public void setDemandquantity(int demandquantity) {
        this.demandquantity = demandquantity;
    }

    @Override
    public String toString() {
        return "Demandpojo{" + "useremail=" + useremail + ", prodId=" + prodId + ", demandquantity=" + demandquantity + '}';
    }
    
    
}
