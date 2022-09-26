package ch07.sec03.exam02;


//default 생성자 = parameter가 없는 생성자
public class A {
	A() {
		System.out.println("A의 default 생성자");
	}
	A(int a){
		System.out.println("A의 int 타입 매개변수 1개인 생성자");
	}
	A(int a, int b){
		System.out.println("A의 int 타입 매개변수 2개인 생성자");
	}
}


//부모 클래스의 생성자 중 원하는 생성자를 호출하려면
//super() 메소드를 실행
//실행 시 매개변수에 해당 값 넘겨주면 jvm이 찾아서 실행

class B extends A{
	B(){//부모 생성자 호출 메소드 super(); 반드시 생성자 블럭의 첫 줄에 작성 
		super();
		System.out.println("B의 default 생성자");
	}
	B(int a){
		super(a);
		System.out.println("B의 int 타입 매개변수 1개인 생성자");
	}
	B(int a, int b){
		super();
		System.out.println("B의 int 타입 매개변수 2개인 생성자");
	}
	
}

class C extends B{
	C(){
		super(10);
		System.out.println("C의 기본 생성자");
	}
}