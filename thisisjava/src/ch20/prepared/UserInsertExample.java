package ch20.prepared;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//1. 드라이버 로딩
//2. connection 연결 객체 얻기
//3. sql문 작성
//4. 결과 확인
//5. 자원해제
public class UserInsertExample {
	//1. 드라이버 로딩
	//2. connection 연결 객체 얻기
	//3. sql문 작성
	//4. 결과 확인
	//5. 자원해제
	public static void main(String[] args) {
		//0. connection 변수 선언
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
			String sql ="insert into users values(?, ?, ?, ?, ?)";
			System.out.println(sql);
			
			//3-2. 쿼리문 전달객체 생성
			PreparedStatement pstmt =  conn.prepareStatement(sql);
			
			// 3-2-1. 값 세팅
			// pstmt의 sql의 ? 자리에 들어가는 순서와 내용 입력
			pstmt.setString(1, "hong");
			pstmt.setString(2, "홍길동");
			pstmt.setString(3, "1234");
			pstmt.setInt(4, 25);
			pstmt.setString(5, "hong@naver.com");
			//3-3. 쿼리문 전달 및 실행
			// -- insert/update/delete 일 때 executeupdate()
			// return 값은 입력/수정/삭제한 행의 수
			int result = pstmt.executeUpdate();
			if(result > 0) System.out.println(result+"행이 입력됨");
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
