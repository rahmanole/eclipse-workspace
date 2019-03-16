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
import pojo.Product;
import pojo.ProductCategory;
import pojo.Summary;

/**
 *
 * @author ccsl-pc
 */
public class SummaryService {
    
    public static void createTable() {
        String sql = "create table IF NOT EXISTS summary(id int(10) primary key auto_increment,"
                + "productName varchar(55),productCode varchar(55),available_qty int(10),"
                + "purchased_qty int,sold_qty int,revenue double,catId int(5),"
                + "foreign key (catId) references productCat(id))";

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
    
    public Summary isProductExistsInSummaryTable(String productCode){
        ProductCatService pc = new ProductCatService();
        Summary summary=null;
        String sql = "select * from summary where productCode=?";
        Connection conn = ConnectionDB.connecet();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, productCode);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                System.out.println("Exists");
                return new Summary(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getInt(4), 
                        rs.getInt(5),  rs.getInt(6),  rs.getInt(7), pc.getProductCatByCatId(rs.getInt(8)) );
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
        return summary;
    }
    
    public int save(Product product){
        String sql = "insert into summary(productName,productCode,available_qty,"
                + "purchased_qty,sold_qty,revenue,"
                + "catId) values(?,?,?,?,?,?,?)";
        
        Connection conn = ConnectionDB.connecet();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, product.getProductName());
            ps.setString(2, product.getProductCode());
            ps.setInt(3, product.getQty());
            ps.setInt(4, product.getQty());
            ps.setInt(5, 0);
            ps.setDouble(6, 0);
            ps.setInt(7, product.getCat().getId());
            ps.executeUpdate();
            System.out.println("Table created!!");
            
            return 1;
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
    
    public int update(Summary summary,Product product){
        
        

        String sql = "update summary set available_qty=?, purchased_qty=?";
        
        Connection conn = ConnectionDB.connecet();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, summary.getAvailableQty()+product.getQty());
            ps.setInt(2, summary.getPurchasedQty()+product.getQty());
            ps.executeUpdate();            
            return 1;
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
    
    public List<Summary> getSummaryList(){
        
        ProductCatService pCatService = new ProductCatService();
        List<Summary> products = new ArrayList();
        
        String sql = "Select * from summary";
        Connection conn = ConnectionDB.connecet();
        
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
               products.add(new Summary(rs.getInt(1), rs.getString(2), rs.getString(3),
                       rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getDouble(7), pCatService.getProductCatByCatId(rs.getInt(8))));
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
        
        return products;
    }
    
}
