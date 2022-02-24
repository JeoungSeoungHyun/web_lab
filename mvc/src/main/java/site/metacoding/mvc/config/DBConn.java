package site.metacoding.mvc.config;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBConn {

	// 이미 만들어져있는 connection 객체값을 return받기 위한 메서드
	public static Connection getConnection() {

		Connection conn = null;

		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env"); // JNDI 박스 이름
			DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle"); // DataSource 변수 이름
			conn = ds.getConnection();
			System.out.println("DB연결 성공");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB연결 실패");
		}
		return conn;
	}
}
