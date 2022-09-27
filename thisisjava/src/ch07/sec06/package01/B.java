package ch07.sec06.package01;

public class B {
	void m1() {
		
		A a = new A();
		//같은 패키지(protected)에서 접근 가능
		a.field = "A";
		//같은 패키지(protected)에서 접근 가능
		a.method();
	}
	
}
