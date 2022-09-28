package ch07.ex.ex09;

public class MainClassExample {
	public static void main(String[] args) {
		//ClassCastException 발생
		B b = (B)new A();
		
		method(b);
		
	}
	
	static void method(B b) {
		System.out.println(b.toString());
	}
}

class A{}
class B extends A{
	
}
class C extends A{}
class D extends B{}
class E extends B{}
class F extends C{}
