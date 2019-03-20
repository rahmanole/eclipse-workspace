/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImpl;

import conn.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ccsl-pc
 */
public class SupplierService {
    public static void createTable(){
        String sql = "create table IF NOT EXISTS supplier(id int(10) primary key auto_increment,"
                + "name varchar(55),email varchar(55),contactNumOne varchar(55),contactNumTwo varchar(55),address varchar(200))";

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

}
