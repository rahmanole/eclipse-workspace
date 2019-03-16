/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.Date;

public class Product {
    private int id;
    private String productName;
    private String productCode;
    private int qty;
    private double untiPrice;
    private double totalPrice;
    private Date date;
    private ProductCategory cat;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductCategory getCat() {
        return cat;
    }

    public void setCat(ProductCategory cat) {
        this.cat = cat;
    }
    
    


    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUntiPrice() {
        return untiPrice;
    }

    public void setUntiPrice(double untiPrice) {
        this.untiPrice = untiPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Product(String productName, String productCode, int qty, double untiPrice, double totalPrice, Date date, ProductCategory cat) {
        this.productName = productName;
        this.productCode = productCode;
        this.qty = qty;
        this.untiPrice = untiPrice;
        this.totalPrice = totalPrice;
        this.date = date;
        this.cat = cat;
    }

    public Product(int id, String productName, String productCode, int qty, double untiPrice, double totalPrice, Date date, ProductCategory cat) {
        this.id = id;
        this.productName = productName;
        this.productCode = productCode;
        this.qty = qty;
        this.untiPrice = untiPrice;
        this.totalPrice = totalPrice;
        this.date = date;
        this.cat = cat;
    }


    
    
    
}
