/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.pojo;

import java.io.InputStream;
import java.util.Date;

/**
 *
 * @author rj851
 */
public class OrderDetailPojo {
    private String orderId;
    private String prodId;
    private String prodName;
    private int quantity;
    private double amount;
    private int shippde;
    private Date time;
    private InputStream prodImage;

    public OrderDetailPojo() {
    }

    public OrderDetailPojo(String orderId, String prodId, String prodName, int quantity, double amount, int shippde, Date time, InputStream prodImage) {
        this.orderId = orderId;
        this.prodId = prodId;
        this.prodName = prodName;
        this.quantity = quantity;
        this.amount = amount;
        this.shippde = shippde;
        this.time = time;
        this.prodImage = prodImage;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getShippde() {
        return shippde;
    }

    public void setShippde(int shippde) {
        this.shippde = shippde;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public InputStream getProdImage() {
        return prodImage;
    }

    public void setProdImage(InputStream prodImage) {
        this.prodImage = prodImage;
    }

    @Override
    public String toString() {
        return "OrderDetailPojo{" + "orderId=" + orderId + ", prodId=" + prodId + ", prodName=" + prodName + ", quantity=" + quantity + ", amount=" + amount + ", shippde=" + shippde + ", time=" + time + '}';
    }
    
    
}
