package ch07.sec07.exam01;


class A{
	
}
class B extends A{
	
}
class C extends A{
	
}
class D extends B{
	
}
class E extends C{
	
}

//자동 형 변환(Promotion - upcasting)
public class PromotionExample {
	public static void main(String[] args) {
		A a = new B();	//A타입으로 자동 변환 되어 대입
		a = new C();	//A타입으로 자동 변환 되어 대입
		a = new D();	//A타입으로 자동 변환 되어 대입	
		a = new E();	//A타입으로 자동 변환 되어 대입
		
		B b = new B();	
		b = new D();	//B타입으로 자동 변환 되어 대입
		
		C c = new C();
		c = new E();	//C타입으로 자동 변환 되어 대입
		
		D d = new D();
		
		E e = new E();
		
		//객체를 참조하는 참조 변수 대입 가능
		
		a = b;
		a = c;
		a = d;
		a = e;
		
		a = b;	//시작이 B객체로 생성돼 시작
		
		B b2 = (B)a;	//강제 형 변환(down-casting)
		
		// 자신보다 하위의 자식 클래스로는 변환 불가(시작이 자신이므로)
		// B -> A -> B -> D
		A a2 = new B();
		B b3 = (B)a2;
		D d2 = (D)b3;
		
		
		//sytax 에러는 없음
		// ClassCastExption 에러 발생
		// B -> A, C -> A
		B b4 = new B();
		C c4 = new C();
		A a4 = b4;
		C c5 = (C) a4; // B -> A -> C
		
	}
}
