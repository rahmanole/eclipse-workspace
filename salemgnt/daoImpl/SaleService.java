/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImpl;

import conn.ConnectionDB;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.SaleProduct;
import pojo.Summary;

/**
 *
 * @author ccsl-pc
 */
public class SaleService {
    public static void createTable() {
        String sql = "create table IF NOT EXISTS saleHistory(id int(10) primary key auto_increment,"
                + "productCatName varchar(55),productName varchar(55),productCode varchar(55),"
                + "salePrice double,quantity int,vat double,totalPrice double,clientName varchar(55),contactNumber varchar(55),saleDate Date)";
                

        Connection conn = ConnectionDB.connecet();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Table created!!");
        } catch (SQLException ex) {
            Logger.getLogger(RoleServices.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(RoleServices.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
 

    
    public int save(SaleProduct saleProduct){
        String sql = "insert into saleHistory(productCatName,productName,productCode,"
                + "salePrice,quantity,vat,totalPrice,clientName,contactNumber,saleDate) values(?,?,?,?,?,?,?,?,?,?)";
        
        Connection conn = ConnectionDB.connecet();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, saleProduct.getProductCatName());
            ps.setString(2, saleProduct.getProductName());
            ps.setString(3, saleProduct.getProductCode());
            ps.setDouble(4, saleProduct.getSalePrice());
            ps.setInt(5, saleProduct.getQuantity());
            ps.setDouble(6, saleProduct.getVat());
            ps.setDouble(7, saleProduct.getTotalPrice());
            ps.setString(8, saleProduct.getClientName());
            ps.setString(9, saleProduct.getCntNumber());
            ps.setDate(10, saleProduct.getSaleDate());
            ps.executeUpdate();
            return  1;
        } catch (SQLException ex) {
            Logger.getLogger(RoleServices.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(RoleServices.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return -1;
    }
    
    public List<SaleProduct> getAllSales(){
        List<SaleProduct> sales = new ArrayList<>();
        String sql = "Select * from saleHistory";
        Connection conn = ConnectionDB.connecet();
        
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
               sales.add(new SaleProduct(rs.getInt(1), rs.getString(2), rs.getString(3),
                       rs.getString(4), rs.getDouble(5), rs.getInt(6), rs.getDouble(7),rs.getDouble(8),rs.getString(9),rs.getString(10),rs.getDate(11)));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RoleServices.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(RoleServices.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
        return sales;
    }
}
