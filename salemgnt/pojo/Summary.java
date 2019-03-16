/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.Date;

/**
 *
 * @author ccsl-pc
 */
public class Summary {
    private int id;
    private String productName;
    private String productCode;
    private int availableQty;
    private int purchasedQty;
    private int soldQty;
    private double revenue;
    private ProductCategory cat;

    public Summary(int id, String productName, String productCode, int availableQty, int purchasedQty, int soldQty, double revenue, ProductCategory cat) {
        this.id = id;
        this.productName = productName;
        this.productCode = productCode;
        this.availableQty = availableQty;
        this.purchasedQty = purchasedQty;
        this.soldQty = soldQty;
        this.revenue = revenue;
        this.cat = cat;
    }
    
    

    public Summary(String productName, String productCode, int availableQty, int purchasedQty, int soldQty, double revenue, ProductCategory cat) {
        this.productName = productName;
        this.productCode = productCode;
        this.availableQty = availableQty;
        this.purchasedQty = purchasedQty;
        this.soldQty = soldQty;
        this.revenue = revenue;
        this.cat = cat;
    }
    
    

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

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(int availableQty) {
        this.availableQty = availableQty;
    }

    public int getPurchasedQty() {
        return purchasedQty;
    }

    public void setPurchasedQty(int purchasedQty) {
        this.purchasedQty = purchasedQty;
    }

    public int getSoldQty() {
        return soldQty;
    }

    public void setSoldQty(int soldQty) {
        this.soldQty = soldQty;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public ProductCategory getCat() {
        return cat;
    }

    public void setCat(ProductCategory cat) {
        this.cat = cat;
    }
    
    
}
