package ch07.sec01;

public class C extends Parent{
	int a = 10;
	String str = "hello";
	void method1(String msg, String name) {
		System.out.println(name + ", " + msg);
	}
	void method2(int x) {
		System.out.println(x);
	}
}
