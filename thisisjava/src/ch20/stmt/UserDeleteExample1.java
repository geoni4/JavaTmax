package ch20.stmt;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

//1. 드라이버 로딩
//2. connection 연결 객체 얻기
//3. sql문 작성
//4. 결과 확인
//5. 자원해제
public class UserDeleteExample1 {
	//1. 드라이버 로딩
	//2. connection 연결 객체 얻기
	//3. sql문 작성
	//4. 결과 확인
	//5. 자원해제
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
			Statement stmt = conn.createStatement();
			
			System.out.println("삭제할 회원 id >");
			String userid=scanner.next();
			String sql = new StringBuilder()
					.append("delete from users where userid='"+userid+"'").toString();
			System.out.println(sql);
			int result = stmt.executeUpdate(sql);
			
			//3-2. 쿼리문 전달객체 생성
			//3-3. 쿼리문 전달 및 실행
			// -- insert/update/delete 일 때 executeupdate()
			// return 값은 입력/수정/삭제한 행의 수
			if(result > 0) System.out.println(result+"행이 삭제됨");
			sql = "select * from users";
			ResultSet rs = stmt.executeQuery(sql);
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
