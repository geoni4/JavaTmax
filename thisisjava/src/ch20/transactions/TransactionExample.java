package ch20.transactions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionExample {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",
				"java",
				"oracle");
			
			String sql1 = "update accounts set balance = balance - ? where ano= ?";
			
			PreparedStatement pstmt1 = conn.prepareStatement(sql1);
			conn.setAutoCommit(false);
			
			pstmt1.setInt(1, 10000);
			pstmt1.setString(2, "111-111-1111");
			
			int rows1 = pstmt1.executeUpdate();
			if(rows1 == 0 ) throw new Exception("출금 되지 않음");
			pstmt1.close();
			
			String sql2 = "update accounts set balance = balance + ? where ano= ?";
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			pstmt2.setInt(1, 10000);
			pstmt2.setString(2, "222-222-2222");
			
			int rows2 = pstmt2.executeUpdate();
			if(rows2 == 0 ) throw new Exception("출금 되지 않음");
			
			pstmt2.close();
			
			
			conn.commit();
			System.out.println("계좌 이체 성공");
		} catch(Exception e) {
			try {
				//예외 발생 시 롤백
				conn.rollback();
				
			} catch(SQLException e1) {
				System.out.println("계좌 이제 실패");
				e.printStackTrace();
			}
		} finally {
			if(conn != null) {
				try{
					conn.setAutoCommit(true);
					conn.close();
				} catch(SQLException e) {
					
				}
			}
		}
	}
}
