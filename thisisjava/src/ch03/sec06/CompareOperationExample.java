package ch03.sec06;

public class CompareOperationExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		char char1 = 'A';// 65
		char char2 = 'B';// 66
		boolean result4 = (char1 < char2); // 65 < 66, 비교 연산 시 int 타입으로 변환되어 연산
		System.out.println("result4 : " + result4);
		
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4);// 연산 시에 num3가 double 1.0으로 바뀐다.
		System.out.println("result5 : " + result5);
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6 = (num5 == num6);
		boolean result7 = (num5 == (float)num6);
		System.out.println("result6 : " + result6);
		System.out.println("result7 : " + result7);
		System.out.println(num5*4 + "   " + num6*4);
		String str1 = "자바";
		String str2 = "Java";
		boolean result8 = (str1 == str2); // str1과 str2가 참조하고 있는 문자열(String)객체의 번지수 비교(해시코드 값)
		boolean result9 = (!str1.equals(str2));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println("result8 : " + result8);
		System.out.println("result9 : " + result9);
	}
}
