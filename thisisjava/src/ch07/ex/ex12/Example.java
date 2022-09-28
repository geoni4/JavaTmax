package ch07.ex.ex12;

public class Example {
	public static void action (A a){
		a.method1();
		//java 15부터 가능한 문법
		if(a instanceof C c){ // a가 C c이면 c를 사용 가능
			c.method2();
		}
	}
	
	public static void main(String[] args){
		action(new A());
		action(new B());
		action(new C());
	}
}