package ch12.sec06;

public class ValueCompareExample {
	public static void main(String[] args) {
		// -128 ~ 127 (byte 타입의 범위 초과)
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		//System.out.println(obj1 == obj2);
		//System.out.println(obj1.equals(obj2));
		
		// -128 ~ 127 (byte 타입의 범위 내)
		
		Integer obj3 = 125;
		Integer obj4 = 125;
		
		//System.out.println(obj3 == obj4);
		
		Double d1 = 3.14;
		Double d2 = 3.14;
		
		System.out.println(d1 == d2);
		System.out.println(d1.equals(d2));
	}
}
