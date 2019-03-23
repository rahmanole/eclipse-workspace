/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import com.mysql.jdbc.Connection;
import controller.pojo.PersonalInfo;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.conn.ConnectionForDB;

/**
 *
 * @author ccsl-pc
 */
public class PersonalInfoServices {

    private int id;
    private String name;
    private String contNum;
    private String email;
    private int dept_id;
    private String regNum;
    private String session;

    static String sql = "create table IF NOT EXISTS personal_info(id int(6)primary key auto_increment,"
            + "name varchar(55),cnt_num varchar(20),email varchar(55),dept_id int(4),"
            + "reg_num varchar(20),session varchar(20),foreign key (dept_id) references dept_names(id))";

    public int saveInfo(PersonalInfo personalInfo) {
        String insert = "insert into personal_info(name,cnt_num,email,dept_id,reg_num,session) values(?,?,?,?,?,?)";

        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, personalInfo.getName());
            ps.setString(2, personalInfo.getContNum());
            ps.setString(3, personalInfo.getEmail());
            ps.setInt(4, personalInfo.getDept().getId());
            ps.setString(5, personalInfo.getRegNum());
            ps.setString(6, personalInfo.getSession());
            ps.executeUpdate();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int updateInfo(PersonalInfo personalInfo) {
        String update = "update personal_info set name=?,cnt_num=?,email=?,dept_id=?,reg_num=?,session=? where id=?";

        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(update);
            ps.setString(1, personalInfo.getName());
            ps.setString(2, personalInfo.getContNum());
            ps.setString(3, personalInfo.getEmail());
            ps.setInt(4, personalInfo.getDept().getId());
            ps.setString(5, personalInfo.getRegNum());
            ps.setString(6, personalInfo.getSession());

            ps.setInt(7, personalInfo.getId());
            ps.executeUpdate();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return -1;
    }
}
