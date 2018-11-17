package jdbc;

import java.sql.*;

public class connect {
	//final static String db = "jdbc:oracle:thin:@localhost:1521:xe";
	//final static String driver = "oracle.jdbc.driver.OracleDriver";
	final static String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final static String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";

	public static void main(String[] args) throws ClassNotFoundException {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			Class.forName(DRIVER_NAME);
			conn = DriverManager.getConnection(DB_URL, "minhaz", "abc123");
			System.out.println("Connected successfully.........");
			String sql = "update students"+" set address = 'Rangpur' where id = 3";
			pst = conn.prepareStatement(sql);
			pst.executeUpdate();
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
