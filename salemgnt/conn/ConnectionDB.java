/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conn;

import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ccsl-pc
 */
public class ConnectionDB {
    public static Connection conn = null;
    
   public static Connection connecet(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/salemgnt","root","1234");
            System.out.println("Connected success fully");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       return conn;
   }
   
   
}
