package ch06.sec08;

public class ReturnExample {
	void method1() {
		System.out.println("메소드에서");
		System.out.println("return문이 하는 역할은");
		System.out.println("return문 전까지의 명령 실행 후");
		System.out.println("return문을 만나면");
		System.out.println("메소드를 호출한 곳으로 되돌아가는 명령");
		return;
	}
	public static void main(String[] args) {
		ReturnExample re = new ReturnExample();
		System.out.println("시작");
		re.method1();
		System.out.println("끝");
	}
}
