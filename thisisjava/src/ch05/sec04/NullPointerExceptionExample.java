package ch05.sec04;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		//참조 변수는 선언 후 new에 의한 객체 생성 및 대입을 해야 참조 변수에 접근 가능
		//그렇지 않으면 예외 발생
		//java.lang.NullPointerException
		int[] intArray =  null;
		//intArray[0] = 10;
		
		String str = null;
		System.out.println("총 문자 수: " + str.length());//java.lang.NullPointerException
	}
}
