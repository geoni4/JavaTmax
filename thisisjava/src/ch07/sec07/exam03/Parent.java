package ch07.sec07.exam03;

public class Parent {
	public String field1;
	public void method1() {
		System.out.println("부모 메소드 method1");
	}
	public void method2() {
		this.method1();
		System.out.println("부모 메소드 method2");
	}
	public void method4(int a) {
		System.out.println(a);
	}
}

//자식 클래스에서 해당 클래스 내 다른 메소드 호출 시 this.method()
//자식 클래스에서 부모 클래스 내 다른 메소드 호출 시 super.method()
class Child extends Parent{
	@Override
	public void method2() {
		super.method2();//여기서 super는 부모 메소드
		System.out.println("자식 메소드 method2");
		super.method4(10);
	}
	public void method3() {
		this.method2();
		System.out.println("자식 메소드 method3");
	}
}
