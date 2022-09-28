package ch09.sec03.exam01;

public class AExample {
	public static void main(String[] args) {
		//Static이 아닌 멤버의 사용법
		A.B b = new A.B();
		System.out.println(b.field1);
		b.method1();
		
		//B의 정적 필드 메소드 사용
		System.out.println(A.B.field2);
		A.B.method2();
		
	}
}
