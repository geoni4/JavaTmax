package ch20.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserSelectExample {
	public static void main(String[] args) {
		Connection conn = null;
		//1-1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			//	2. 연결 객체 인스턴스 생성
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="java";
			String password="oracle";
			conn = //factory패턴(GOF)
				DriverManager.getConnection(url, user, password);
			
			// sql문 작성
			String sql = "select * from users";
			
			// sql문 전달 객체 생성
			Statement stmt = conn.createStatement();
			
			//sql문 싱행하고 결과
			// select문은 executeQuery()로 실행
			ResultSet rs = stmt.executeQuery(sql);
			
			// 결과 보기
			while(rs.next()) {
				String id = rs.getString("userid");
				String name = rs.getString("username");
				String pwd = rs.getString("userpassword");
				int age = rs.getInt("userage");
				String email = rs.getString("useremail");
				System.out.printf("id: %s, name: %s, password: %s, age: %d email: %s\n", id, name, pwd, age, email);
			}
			
		}catch(Exception e) {
			
		}
	}
}
