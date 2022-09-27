package ch07.sec08.exam02;

public class A {
	public static void main(String[] args) {
		F f = new F();
		System.out.println(f instanceof F);
		System.out.println(f instanceof D);
		System.out.println(f instanceof B);
		System.out.println(f instanceof A);
		
		B b = new B();
		System.out.println(b instanceof D);
		System.out.println(b instanceof B);
		System.out.println(b instanceof A);
		
	}
}

class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}
class F extends D{}
