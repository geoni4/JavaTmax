package ch05.sec04;

public class GarbageObjectExample {
	public static void main(String[] args) {
		String hobby = "여행"; //String 타입 객체ㄹ는 리터럴로 생성 시 new String()으로 자동 생성
		char[] c = new char[] {'여', '행'};
		System.out.println(hobby.hashCode());
		hobby = null;//null은 기본타입에서는 사용 불가, 참조타입의 초기화로 사용가능.
		//null pointer exception
		//System.out.println(hobby.hashCode());
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null;
		System.out.println("kind2: " + kind2);
		c = null;
	}
}
