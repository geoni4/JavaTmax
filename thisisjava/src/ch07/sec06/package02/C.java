package ch07.sec06.package02;

import ch07.sec06.package01.A;

public class C {
	void m1() {
		
		//protected로 선언된 생성자는 다른 패키지에서 접근 불가
		//A a = new A();
		
		//같은 패키지(protected)에서 접근 가능
		//a.field = "A";
		//같은 패키지(protected)에서 접근 가능
		//a.method();
	}
	
}
