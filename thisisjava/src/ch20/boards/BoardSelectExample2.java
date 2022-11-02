package ch20.boards;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BoardSelectExample2 {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user = "java";
			String password = "oracle";
			
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = new StringBuilder()
					.append("select bno, btitle, bcontent, bwriter, bdate,"
						  + " bfilename, bfiledata from boards where bwriter = ?").toString();
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "winter");
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Board board = new Board();
				
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBfilename(rs.getString("bfilename"));
				board.setBfiledata(rs.getBlob("bfiledata"));
				
				System.out.println(board);

				
				Blob blob = board.getBfiledata();
				if(blob !=null) {
					InputStream is = blob.getBinaryStream();
					OutputStream os = new FileOutputStream("c:/temp/" + board.getBfilename());
					
					is.transferTo(os);
					os.flush();
					os.close();
					is.close();
					
				}
			}
			rs.close();
			pstmt.close();
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				conn.close();
			} catch(SQLException e) {
				
			}
		}
	}
}
