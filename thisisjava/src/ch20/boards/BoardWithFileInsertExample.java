package ch20.boards;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class BoardWithFileInsertExample {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user = "java";
			String password = "oracle";
			
			conn = DriverManager.getConnection(url, user, password);
			
			String sql ="insert into boards values(seq_bno.nextval, ?, ?, ?, sysdate, ?, ?)";
			System.out.println(sql);
			
			PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"bno"});
			
			pstmt.setString(1, "눈 오는 날");
			pstmt.setString(2, "함박눈이 내려요.");
			pstmt.setString(3, "winter");
			pstmt.setString(4, "snow.jpg");
			pstmt.setBlob(5, new FileInputStream("./src/ch20/oracle/sec06/snow.jpg"));
			
			int result = pstmt.executeUpdate();
			
			if(result >0) {
				System.out.println(result + "행이 입력 됨");
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next()) {
					int bno = rs.getInt(1);
					System.out.println("저장된 bno: " + bno);
				}
				
			}
			
			
						
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			 try {
				 conn.close();
			 }catch (Exception e) {
	            System.out.println(e.getMessage());
			}
		 }
	}
}
