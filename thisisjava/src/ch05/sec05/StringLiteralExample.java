package ch05.sec05;

public class StringLiteralExample {
	public static void main(String[] args) {
		// 리터럴로 만들어진 String은 동일한 객체로 사용 가능(상수임)
		// String의 리터럴을 상수 풀에 넣어준다(Static의 constant pool)
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name2));
		char c = name1.charAt(0);
		System.out.println(c);
	}
}
