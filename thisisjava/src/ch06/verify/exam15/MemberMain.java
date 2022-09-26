package ch06.verify.exam15;

public class MemberMain {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		String id, password;
		boolean result = memberService.login("홍길동", "12345");
		if(result) {
			System.out.println("");
			memberService.logout();
		}else {
			System.out.println();
		}
	}
}
