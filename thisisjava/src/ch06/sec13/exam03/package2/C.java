package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.A;
//다른 패키지에서 public으로 선언된 A클래스 접근 가능
public class C {
	//동일 패키지에서 A클래스(생성자) 접근
	//동일 패키지에서 A클래스 접근 가능
	A a = new A();
	void method() {
		a.field1 = 10;
		//default 접근 제한자는 다른 패키지에서 접근 불가
		//a.field2 = 5;
		//private 필드는 같은 패키지에서도 접근 불가
		//a.field3 = 0;
		
		a.method1();
		//default 접근 제한자로 선언된 메소드는 다른 패키지에서 접근 불가
		//a.method2();
		//private 접근 제한자로 선언된 메소드는 같은 패키지에서도 접근 불가
		//a.method3();
	}
	
	
	
	
}
