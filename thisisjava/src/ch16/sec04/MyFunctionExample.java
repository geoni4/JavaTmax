package ch16.sec04;

public class MyFunctionExample {
	public static void main(String[] args) {
		MyFunctionalInterface mf = new MyFunctionalInterface() {
			
			@Override
			public void greet(String name) {
				System.out.println(name + "님 ㅎㅇ");
				
			}
		};
		mf.greet("홍길동");
		
		mf = (name) -> System.out.println(name + "님 ㅎㅇ");
		
		mf.greet("홍길동");
	}
}
