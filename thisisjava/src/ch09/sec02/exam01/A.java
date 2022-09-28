package ch09.sec02.exam01;

public class A {
	
	//인스턴스 멤버 클래스
	//바깥 클래스 $ 안쪽 클래스
	class B{
		
	}
	class C{
		
	}
	class D{
		
	}
	//인스턴스 필드값으로 B 객체 초기화
	B field = new B();
	
	
	//생성자
	A(){
		B b = new B();
	}
	
	//인스턴스 메소드
	void method() {
		B b = new B();
	}
}

class B{
	
}