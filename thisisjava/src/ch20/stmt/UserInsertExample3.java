package ch20.stmt;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

//1. 드라이버 로딩
//2. connection 연결 객체 얻기
//3. sql문 작성
//4. 결과 확인
//5. 자원해제
public class UserInsertExample3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
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
			System.out.println("id, name, pwd, email, age 순으로 입력해주세요.");
			String id=scanner.next();
			String name = scanner.next();
			String pwd = scanner.next();
			String email = scanner.next();
			int age = scanner.nextInt();
			
			//3. sql문 작성 DBMS에 전달
			String sql = new StringBuilder()
					.append("INSERT INTO users(userid, username, userpassword, userage, useremail)")
					.append(" VALUES('"+id+"', '"+name+"', '"+pwd+"', "+age+", '"+email+"')").toString();
			System.out.println(sql);
			
			//3-2. 쿼리문 전달객체 생성
			Statement stmt = conn.createStatement();
			//3-3. 쿼리문 전달 및 실행
			// -- insert/update/delete 일 때 executeupdate()
			// return 값은 입력/수정/삭제한 행의 수
			int result = stmt.executeUpdate(sql);
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
