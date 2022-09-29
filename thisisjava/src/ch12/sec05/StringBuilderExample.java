package ch12.sec05;

public class StringBuilderExample {
	public static void main(String[] args) {
		String str = new StringBuilder()
							.append("ABD")
							.insert(2, "CDE")
							.delete(3, 4)
							.toString();
		System.out.println(str);
	}
}
