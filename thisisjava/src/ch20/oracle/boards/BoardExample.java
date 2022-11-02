package ch20.oracle.boards;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BoardExample {
	Scanner scanner = new Scanner(System.in);
	Connection conn = null;
	
	
	public static void main(String[] args) {
		BoardExample boardExample = new BoardExample();
		
		boardExample.list();

	}

	public void list() {
		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("--------------------------------------------------------");
		System.out.printf("%-6s %-12s %-16s %-40s\n", "no", "writer", "date", "title");
		System.out.println("--------------------------------------------------------");
		
		try {
			
			conn = getConnection();
			String sql = new StringBuilder()
					.append("select bno, bwriter, bdate, btitle"
						  + " from boards order by bno desc").toString();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBdate(rs.getDate("bdate"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBtitle(rs.getString("btitle"));
				System.out.printf("%-6s %-12s %-16s %-40s \n",
	             board.getBno(),
	             board.getBwriter(),
	             board.getBdate(),
	             board.getBtitle());
			}
			rs.close();
			pstmt.close();
			
		
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				conn.close();
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		mainMenu();
	}
	
	public void mainMenu() {
		System.out.println();
		System.out.println("--------------------------------------------------");
		System.out.println("메인 메뉴: 1. Create | 2. Read | 3. Clear | 4. Exit");
		System.out.println("--------------------------------------------------");
		System.out.print("메뉴 선택: ");
		String menuNo = scanner.nextLine();
		System.out.println();
		
		switch(menuNo) {
		case "1" -> create();
		case "2" -> read();
		case "3" -> clear();
		case "4" -> exit();
		
		}
	}
	
	public void create() {
		String sql = "insert into boards(bno, btitle, bcontent, bwriter, bdate)"
				+ " values(seq_bno.nextval, ?, ?, ?, sysdate)";
		//btitle, bcontent, bwriter
		Board board = new Board();
		
		System.out.println("새 게시물 입력");
		System.out.print("제목: ");
		board.setBtitle(scanner.next());
		System.out.print("내용: ");
		board.setBcontent(scanner.next());
		System.out.print("작성자: ");
		board.setBwriter(scanner.next());
		
		try {
			conn = getConnection();
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getBtitle());
			pstmt.setString(2, board.getBcontent());
			pstmt.setString(3, board.getBwriter());
			
			int result = pstmt.executeUpdate();
			if(result > 0) System.out.println("추가된 행 개수: " + result);
			
			pstmt.close();
			
			conn.close();
		} catch(Exception e) {
			e.printStackTrace();
			exit();
		}
		list();
	}
	public void read() {
		String sql = "select bno, btitle, bcontent, bwriter, bdate"
				+ " from boards where bno=?";
		//btitle, bcontent, bwriter
		
		System.out.println("게시물 읽기");
		System.out.print("bno: ");
		int bno = Integer.parseInt(scanner.nextLine());
		
		
		try {
			conn = getConnection();
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			
			ResultSet rs = pstmt.executeQuery();

			Board board = new Board();
			
			while(rs.next()) {
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				System.out.println("번호: " +board.getBno());
				System.out.println("제목: " +board.getBtitle());
				System.out.println("내용: " +board.getBcontent());
				System.out.println("작성자: " +board.getBwriter());
				System.out.println("날짜: " +board.getBdate());
			}
			rs.close();
			
			pstmt.close();
			conn.close();
		} catch(Exception e) {
			e.printStackTrace();
			exit();
		}
		list();
	}
	public void clear() {
		System.out.println("*** clear() 메소드 실행");
		list();
	}
	public void exit() {
		System.out.println("프로그램 종료");
		System.exit(0);
	}
	
	Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "java";
			String password = "oracle";
		
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e){
			e.printStackTrace();
		}
		return conn;
	}
	
}
