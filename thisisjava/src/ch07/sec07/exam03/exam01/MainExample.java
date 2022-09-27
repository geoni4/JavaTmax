package ch07.sec07.exam03.exam01;

public class MainExample {
	public static void main(String[] args) {
		//override는 만들어질 때 이뤄졌기 때문에 부모의 method더라도 이미 override된 후라 override된 method가 실행된다.
		A a = new B();
		a.method();
		
		B b = (B)a;
		b.method();
		
		
		
		
	}
}
