package ch05.sec05;

public class CharAtExample {
	public static void main(String[] args) {
		String str = "자바 프로그래밍";
		System.out.println(str.length());
		//str.length() = method
		for(int i=0;i<str.length();i++) {	// index 0부터 7까지
			char c = str.charAt(i);			//문자열에서 index에 해당하는 문자 하나 저장
			System.out.print(c);
		}
		char[] charArray = {'j', 'a','v', 'a', ' ', 'p', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g'};
		//arr.length = 속성값
		System.out.println(charArray.length);
		str = new String(charArray);
		System.out.println(str);
	}
}
