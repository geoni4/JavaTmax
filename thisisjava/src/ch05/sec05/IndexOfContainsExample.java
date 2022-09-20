package ch05.sec05;

public class IndexOfContainsExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		String substring = subject.substring(location);
		System.out.println(substring);
		
		//해당 패턴의 제일 마지막 위치를 return
		String subject1 = "자바 프로그래밍 자바 또 자바";
		System.out.println(subject1.lastIndexOf("자바"));
		
		//해당 패턴이 문자열에 내에 없으면 리턴 갑은 -1
		System.out.println(subject.indexOf("java"));
		
		// 프로그래밍이라는 단어가 들어있으면 -1이 아니기 때문에 else가 아닌 if쪽이 true
		if(location > -1) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
		
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책");
		} else {
			System.out.println("자바와 관련 없는 책");
		}
	}
}
