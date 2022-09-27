package ch07.sec07.exam02;

public class MainExample {
	public static void main(String[] args) {
		A a;
		B b = new B();
		
		a = b;	//자동 형 변환 (참조 변수 a는 A타입이므로 A타입 범위에만 접근 가능(a.a, a.method1());
		
		a.a = 10;
		a.method1();
		//a.b = 10;	//참조 변수 a범위가 A이므로 자식 클래스인 B객체의 필드에는 접근 불가능
		//a.method2();//참조 변수 a범위가 A이므로 자식 클래스인 B객체의 메소드에 접근 불가능
		
		B b2 = (B)a;//강제 형 변환(참조 변수 b2는 B타입이므로 A타입 범위와 B타입 범위 모두 접근 가능)
		b2.a = 15;	//b2 범위가 B이므로 부모 클래스인 A의 객체 영역의 필드에 접근 가능
		b2.method1();//b2 범위가 B이므로 부모 클래스인 A의 객체 영역의 메소드에 접근 가능
		b2.b = 20;	//b2 범위가 B이므로 자신(자식) 클래스인 B의 객체 영역의 필드에 접근 가능
		b2.method2();//b2 범위가 B이므로 자신(자식) 클래스인 B의 객체 영역의 메소드에 접근 가능
	}
}
