package ch20.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UserUpdateExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
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
			
			System.out.println("수정할 id를 입력 > ");
			String userid =scanner.next();
			
			System.out.println("수정할 password를 입력 > ");
			String userpwd = scanner.next();
			// sql문 작성
			//update users set userpassword='3456' where userid='hong';
			String sql = "update users set userpassword=? where userid=?";
			System.out.println("완성된 sql문: " + sql);
			
			
			// sql문 전달 객체 생성
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, userpwd);
			pstmt.setString(2, userid);
			
			
			//sql문 싱행하고 결과
			// select문은 executeQuery()로 실행
			
			int result = pstmt.executeUpdate();
			if(result > 0) System.out.println(result+"행이 수정됨");
			
			
			sql = "select * from users";
			pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			// 결과 보기
			while(rs.next()) {
				int i = 0;
				// 인덱스 번호( 1부터 시작)로 접근
				String id = rs.getString(++i);
				String name = rs.getString(++i);
				String pwd = rs.getString(++i);
				int age = rs.getInt(++i);
				String email = rs.getString(++i);
				System.out.printf("id: %s, name: %s, password: %s, age: %d email: %s\n", id, name, pwd, age, email);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}