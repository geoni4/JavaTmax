package ch07.sec07.exam03.exam01;

public class A {
	//메소드 정적 바인딩
	void method() {
		System.out.println("A클래스의 메소드");
	}
}

class B extends A{
	
	//재정이된 메소드의 내용이 실행됨.(부모타입으로 프로모션 되더라도, 자신타입으로 캐스팅되더라도)
	@Override
	void method() {
		System.out.println("B클래스에서 재정의된 메소드");
	}
}
