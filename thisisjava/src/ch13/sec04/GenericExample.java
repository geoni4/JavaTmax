package ch13.sec04;

public class GenericExample {
	//제한된 제네릭 메소드
	public static <T extends Number> boolean compare (T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return v1 == v2;
	}
	
	public static void main(String[] args) {
		boolean result1 = compare(3.14, 15);//AutoBoxing 원래는 박싱해서 보내야 됨
		System.out.println(result1);
	}
}
