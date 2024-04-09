package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	//DB접속
	//DB Driver, url, user, password
	//mysql의 드라이버 -> com.mysql.cj.jdbc.Driver
	//mysql의 url -> jdbc:mysql://localhost:3306/내 DB명
	
	private static DatabaseConnection dbc = new DatabaseConnection();
	private Connection conn = null;
	private String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	private String jdbcUrl = "jdbc:mysql://localhost:3306/javadb";
	
	//생성자 : 싱글톤 -> private
	private DatabaseConnection() {
		try {
			Class.forName(jdbcDriver); //드라이버를 로드하기 위해 사용되는 메서드
			//url, user, password
			conn = DriverManager.getConnection(jdbcUrl, "javaUser", "mysql");
		} catch (ClassNotFoundException e) { 
			// TODO: handle exception
			System.out.println("드라이버를 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("SQL 연결정보가 정확하지 않습니다.");
			e.printStackTrace();
		}
	}
	
	public static DatabaseConnection getInstance() {
		return dbc;
	}
	
	public Connection getConnection() {
		return conn;
	}
	
}
