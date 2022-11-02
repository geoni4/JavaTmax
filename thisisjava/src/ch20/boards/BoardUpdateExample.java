package ch20.boards;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardUpdateExample {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDrvier");
			
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"java", 
					"oracle");
			
			String sql = "update boards set btitle=?, bcontent=?, "
						+" bfilename=?, bfiledata=? where bno=?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			String title = "눈사람";
			String content = "눈으로 만든 사람";
			String filename = "snowman.jpg";
			String filedata = "/src/ch20/oracle/sec06/snowman.jpg";
			int bno = 3;
			
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setString(3, filename);
			pstmt.setBlob(4, new FileInputStream(filedata));
			pstmt.setInt(5, bno);
			
			int row = pstmt.executeUpdate();
			if(row > 0) System.out.println("수정한 행 수: " + row);
			
		} catch(Exception e) {
			
		}
	}
}
