package ch07.sec03.exam01;


//자바에서 모든 클래스의 최상위 부모는 Object
//일반 클래스는 extends Object가 생략되었다고 보면 됨.
public class A extends Object{
	protected A() {
		System.out.println("A 생성자");
	}
	public void method1() {
		
	}
	public void method2() {
		
	}
}

class B extends A{
	
	public B() {
		super();// 컴파일 시 추가 됨.
		System.out.println("B 생성자");
	}
}

class C{
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.toString());
		A a = new A();
		System.out.println(a.toString());
	}
	
	
}
