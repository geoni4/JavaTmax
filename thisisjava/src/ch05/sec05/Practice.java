package ch05.sec05;

public class Practice {
	public static void main(String[] args) {
		String str = "가나다라";
		System.out.println(str.hashCode());
		System.out.println(System.identityHashCode(str));
		str = null;
		str = "가나다라";
		System.out.println(str.hashCode());
		System.out.println(System.identityHashCode(str));
	}
}
