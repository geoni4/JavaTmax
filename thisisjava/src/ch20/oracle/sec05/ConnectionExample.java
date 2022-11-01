package ch20.oracle.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {
	public static void main(String[] args) {
		//1. dbms와의 연결 객체 얻기(singleton)
		Connection conn = null;
		try {
			//2. jdbc 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			//3. 연결객체 인스턴스 생성
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="java";
			String password="oracle";
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				conn.close();
				System.out.println("연결 끊기");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		/* DriverManager.getConnection("연결 문자열", "사용자", "비밀번호"); */
	}
}
