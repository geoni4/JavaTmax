package ch09.verify.exam06;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(() ->	System.out.println("트럭이 달립니다."));
	}
}

class Anonymous{
	Vehicle field = () ->System.out.println("자전거가 달립니다.");
	
	void method1() {
		Vehicle localVar = () ->	System.out.println("승용차가 달립니다.");
		localVar.run();
	}
	
	public void method2(Vehicle v) {
		v.run(); 
	}
}