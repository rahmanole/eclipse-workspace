package model.dao;

import com.mysql.jdbc.Connection;
import controller.pojo.Member;
import controller.pojo.PersonalInfo;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.conn.ConnectionForDB;


public class MemberServices {
    public static String sql = "create table IF NOT EXISTS member_info(id int(5)primary key auto_increment,"
            + "name varchar(55),mobile varchar(55),email varchar(55),dept_name varchar(55),reg_no varchar(55),"
            + "session varchar(55),card_no int(5) ,membership_type varchar(55),membership_status varchar(55),creation_date date)";
    
//    public static void main(String[] args) {
//        TableCreateServices.createTable(sql);
//    }
    
     
 
 
 
    public int saveInfo(Member member) {
        String insert = "insert into member_info(name,mobile,email,dept_name,reg_no,"
                + "session,card_no,membership_type,membership_status,creation_date) values(?,?,?,?,?,?,?,?,?,?)";

        try {
            Connection conn = ConnectionForDB.connect();
            
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, member.getName());
            ps.setString(2, member.getMobile());
            ps.setString(3, member.getEmail());
            ps.setString(4, member.getDeptName());
            ps.setString(5, member.getRegNum());
            ps.setString(6, member.getSession());
            ps.setInt(7, member.getCardNo());
            ps.setString(8, member.getMembershipType());
            ps.setString(9, member.getMembershipStaus());
            ps.setDate(10, new Date(System.currentTimeMillis()));
            ps.executeUpdate();
            
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public boolean isEmailExists(String email){
        String sql = "select * from member_info where email = ?";
        try {
            Connection conn = ConnectionForDB.connect();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}

