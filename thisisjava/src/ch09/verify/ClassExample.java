package ch09.verify;

public class ClassExample {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		A.B.C c = new A.B.C();
		A.B.D d = b.new D();
	}
}


class A{
	class B{
		class D{
			
		}
		static class C{
			
		}
	}
}
