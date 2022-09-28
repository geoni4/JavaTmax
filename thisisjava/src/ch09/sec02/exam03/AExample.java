package ch09.sec02.exam03;

public class AExample {
	public static void main(String[] args) {
		
		//static 멤버로 선언된 클래스는
		//A a = new A();
		//클래스명.안쪽 클래스로 접근 
		A.B b = new A.B();
		
	}
}
