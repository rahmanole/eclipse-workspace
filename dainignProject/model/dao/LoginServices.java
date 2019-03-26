/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.conn.ConnectionForDB;

/**
 *
 * @author OLEE
 */
public class LoginServices {

    public boolean isUsrPassMatched(String pin, String email) {
        String stmt = "select email from role where pin=?";
        boolean flag = false;
        try {
            Connection conn = ConnectionForDB.connect();

            PreparedStatement ps = conn.prepareStatement(stmt);
            ps.setString(1, pin);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(email);
                flag = rs.getString(1).equalsIgnoreCase(email) ? true : false;
            }
        } catch (Exception e) {
        }
        return flag;
    }
}
