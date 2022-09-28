package ch08.sec10.exam02;

import java.util.Date;

public class MainExample {
	public static void main(String[] args) {
		A[] arr = new A[4];
		
		
		arr[0] = new B();
		arr[1] = new C();
		arr[2] = new D();
		arr[3] = new E();
		
		for(A a: arr) {
			a.action();
		}
		

	}
}
