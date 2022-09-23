package ch06.ex;

public class MemberService{
	String id;
	String password;
	
	boolean login(String id, String password){
        if("hong".equals(id) && "12345".equals(password))
			return true;
        else 
            return false;
	}
	void logout(String id){
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
}
