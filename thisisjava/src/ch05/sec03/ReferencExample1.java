package ch05.sec03;

public class ReferencExample1 {
	public static void main(String[] args) {
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		
		//참조 변수에서 ==과 !=는 주소값이 서로 같은 지 다른 지 비교
		System.out.println(str1==str2?"동일 객체를 참조합니다":"다른 객체를 참조합니다.");
		
		//
		System.out.println("str1이 참조하는 객체의 주소: " + System.identityHashCode(str1));
		System.out.println("str2이 참조하는 객체의 주소: " + System.identityHashCode(str2));
		
		//객체를 참조하는 변수끼리의 내용비교
		System.out.println(str1.equals(str2)?"str1과 str2의 내용이 같습니다.":"str1과 str2의 내용이 다릅니다.");
		
		//
		System.out.println("str1이 참조하는 객체의 내용: " +str1.hashCode());
		System.out.println("str2이 참조하는 객체의 내용: " +str2.hashCode());
		
		String str3 = str2;
		System.out.println(str2==str3?"동일 객체를 참조합니다":"다른 객체를 참조합니다.");
		System.out.println("str3가 참조하는 객체의 주소: " + System.identityHashCode(str3));
	}
}
