package ch20.boards;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

//1. 드라이버 로딩
//2. connection 연결 객체 얻기
//3. sql문 작성
//4. 결과 확인
//5. 자원해제
public class UserDeleteExample {
	public static void main(String[] args) {
		//0. connection 변수 선언
		Scanner scanner = new Scanner(System.in);
		Connection conn = null;
		//1.
		
		try {
			//1-1. 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			
			//2. 연결 객체 인스턴스 생성
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="java";
			String password="oracle";
			conn = //factory패턴(GOF)
				DriverManager.getConnection(url, user, password);
			
			//3. sql문 작성 DBMS에 전달
			
			System.out.println("삭제할 게시글 번호 > 3");
			String sql = new StringBuilder()
					.append("delete from boards where bno = ? ").toString();
			System.out.println(sql);

			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			int bno = 3;
			
			pstmt.setInt(1, bno);
			
			int row = pstmt.executeUpdate();
			
			//3-2. 쿼리문 전달객체 생성
			//3-3. 쿼리문 전달 및 실행
			// -- insert/update/delete 일 때 executeupdate()
			// return 값은 입력/수정/삭제한 행의 수
			if(row > 0) System.out.println("삭제된 행의 수:" + row);
			
			
			sql = "select * from users";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
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
		
	}
}
