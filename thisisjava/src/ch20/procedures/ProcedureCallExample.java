package ch20.procedures;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class ProcedureCallExample {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		
			conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",
				"java", 
				"oracle");
			
			// 프로시저 호출문 작성 및 CallableStatement 객체 얻기
			String sql = "{call user_create(?, ?, ?, ?, ?, ?)}";
			
			CallableStatement cstmt = conn.prepareCall(sql);
			
			// 값 설정
			cstmt.setString(1, "summer");
			cstmt.setString(2, "한여름");
			cstmt.setString(3, "12345");
			cstmt.setInt(4, 26);
			cstmt.setString(5, "summer@mycompany.com");
			cstmt.registerOutParameter(6, Types.INTEGER);
			
			// 실행
			cstmt.execute();
			
			// 결괏값 얻기
			int rows = cstmt.getInt(6);
			if(rows > 0) System.out.println("저장된 행 수: "+ rows);
			
			
			// CallableStatement닫기
			cstmt.close();
			
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
