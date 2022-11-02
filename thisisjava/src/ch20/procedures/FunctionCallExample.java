package ch20.procedures;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class FunctionCallExample {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		
			conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",
				"java", 
				"oracle");
			
			// 프로시저 호출문 작성 및 CallableStatement 객체 얻기
			String sql = "{? = call user_login(?, ?)}";
			
			CallableStatement cstmt = conn.prepareCall(sql);
			
			// 값 설정
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.setString(2, "winter");
			cstmt.setString(3, "12345");
				
			// 실행
			cstmt.execute();

			// 결괏값 얻기
			int result = cstmt.getInt(1);
			
			// CallableStatement닫기
			cstmt.close();
			
			// 로그인 결과 (switch문 이용)
			String message = switch(result) {
				case 0 -> "로그인 성공";
				case 1 -> "비밀번호가 틀림";
				default -> "아이디가 존재하지 않음";
			};
			System.out.println(message);
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				conn.close();
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
