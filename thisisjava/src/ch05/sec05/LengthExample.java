package ch05.sec05;

public class LengthExample {
	public static void main(String[] args) {
		String ssn = "9506241230123";
		int length = ssn.length();
		
		if(length == 13) {
			System.out.println("주민번호 길이가 맞습니다.");
		} else {
			System.out.println("주민번호 길이가 아닙니다.");
		}
	}
}
