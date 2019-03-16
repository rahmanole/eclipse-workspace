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

public class ProductService {

    public static void createTable() {
        String sql = "create table IF NOT EXISTS product(id int(10) primary key auto_increment,"
                + "productName varchar(55),productCode varchar(55),qty int(10),"
                + "unitPrice double,totalPrice double,purchaseDate Date,catId int(5),"
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

    public int save(Product product) {
        String sql = "insert into product(productName,productCode,qty,unitPrice,totalPrice,purchaseDate,"
                + "catId) values(?,?,?,?,?,?,?)";
        
        Connection conn = ConnectionDB.connecet();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, product.getProductName());
            ps.setString(2, product.getProductCode());
            ps.setInt(3, product.getQty());
            ps.setDouble(4, product.getUntiPrice());
            ps.setDouble(5, product.getTotalPrice());
            ps.setDate(6, (Date) product.getDate());
            ps.setInt(7, product.getCat().getId());
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
    
    public List<Product> getProductList(){
        ProductCatService pCatService = new ProductCatService();
        List<Product> products = new ArrayList();
        
        String sql = "Select * from product";
        Connection conn = ConnectionDB.connecet();
        
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
               products.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3),
                       rs.getInt(4), rs.getDouble(5), rs.getDouble(6), rs.getDate(7), pCatService.getProductCatByCatId(rs.getInt(8))));
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
