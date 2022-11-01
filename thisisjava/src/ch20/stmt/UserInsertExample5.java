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
public class UserInsertExample5 {
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
			String userid=scanner.next();
			String username = scanner.next();
			String userpwd = scanner.next();
			String useremail = scanner.next();
			int userage = scanner.nextInt();
			
			String sql = new StringBuilder()
					.append("INSERT INTO users(userid, username, userpassword, userage, useremail)")
					.append(" VALUES('"+userid+"', '"+username+"', '"+userpwd+"', "+userage+", '"+useremail+"')").toString();
			System.out.println(sql);

			Statement stmt = conn.createStatement();
			
			int result = stmt.executeUpdate(sql);
			if(result > 0) System.out.println(result+"행이 입력됨");
			
			sql = "select * from users";
			
			ResultSet rs = stmt.executeQuery(sql);
			


			
			
			
			while(rs.next()) {
				int i = 0;
			// 	인덱스 번호( 1부터 시작)로 접근
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
