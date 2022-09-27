package ch07.sec07.exam03;

public class MainExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		child.method1();
		child.method2();//상속한 클래스에서 재정의하면 재정의된 메소드가 실행 된다.
		child.method3();
	}
	
}
