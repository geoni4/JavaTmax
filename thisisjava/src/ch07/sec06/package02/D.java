package ch07.sec06.package02;

import ch07.sec06.package01.A;


// 다른 패키지의 A를 상속 받은 D 클래스
public class D extends A {

	//생성자
	protected D() {
		super();	//다른 패키지의 부모(A) 클래스의 A() 생성자 접근 가능
	}
	
	//메소드
	public void method1() {
		this.field = "v";//다른 패키지의 부모(A) 클래스의 필드에 접근 가능
		this.method();	//다른 패키지의 부모(A) 클래스의 메소드에 접근 가능
	}
	
	public void method2() {
		//A a = new A();	//new에 의해 생성된 객체이므로 protected가 걸린 클래스의 생성자 등에 접근 불가
		//a.field = "V";
		//a.method();
	}
	
}
