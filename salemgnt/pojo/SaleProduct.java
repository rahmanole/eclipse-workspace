/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.sql.Date;

/**
 *
 * @author ccsl-pc
 */
public class SaleProduct {
    private int id;
    private String productCatName;
    private String productName;
    private String productCode;
    private double salePrice;
    private int quantity;
    private double vat;
    private double totalPrice;
    private String clientName;
    private String cntNumber;
    private Date saleDate;
    

    public SaleProduct(int id, String productCatName, String productName, String productCode, double salePrice, int quantity, double vat, double totalPrice, String clientName, String cntNumber, Date saleDate) {
        this.id = id;
        this.productCatName = productCatName;
        this.productName = productName;
        this.productCode = productCode;
        this.salePrice = salePrice;
        this.quantity = quantity;
        this.vat = vat;
        this.totalPrice = totalPrice;
        this.clientName = clientName;
        this.cntNumber = cntNumber;
        this.saleDate = saleDate;
    }

    public SaleProduct(String productCatName, String productName, String productCode, double salePrice, int quantity, double vat, double totalPrice, String clientName, String cntNumber, Date saleDate) {
        this.productCatName = productCatName;
        this.productName = productName;
        this.productCode = productCode;
        this.salePrice = salePrice;
        this.quantity = quantity;
        this.vat = vat;
        this.totalPrice = totalPrice;
        this.clientName = clientName;
        this.cntNumber = cntNumber;
        this.saleDate = saleDate;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductCatName() {
        return productCatName;
    }

    public void setProductCatName(String productCatName) {
        this.productCatName = productCatName;
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

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getCntNumber() {
        return cntNumber;
    }

    public void setCntNumber(String cntNumber) {
        this.cntNumber = cntNumber;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }
    
    
    
}
