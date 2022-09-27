package ch07.ex.ex09;

public class MainClassExample {
	public static void main(String[] args) {
		
		B b = (B)new A();
		
		b.method(b);
		
	}
}

class A{}
class B extends A{
	public void method(B b) {
	}
}
class C extends A{}
class D extends B{}
class E extends B{}
class F extends C{}
