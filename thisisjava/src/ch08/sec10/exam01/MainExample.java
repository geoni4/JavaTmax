package ch08.sec10.exam01;

import java.util.Date;

public class MainExample {
	public static void main(String[] args) {
		A a = new B();
		B b = new D();
		
		a = b;
		a = new D();
		b = (B)a;
		D d = (D)b;
		
		A[] arr = new A[5];
		
		arr[0] = new B();
		arr[1] = new B();
		arr[2] = new C();
		arr[3] = new D();
		arr[4] = new E();
		
		arr = new A[] {new B(), new B(), new C(), new D(), new E()};
		
		Object[] arrs = {new Double(3.4), new Integer(10), new Float(3.14f)};
		
		for(Object obj:arrs) {
			System.out.println(obj);
		}
		
	}
}
