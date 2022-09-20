package ch05.sec05;

public class EqualseExample {
	public static void main(String[] args) {
		//리터럴로 만들어진 String 객체는 내용이 같으면 identifyHashcode가 같음.-> 객체를 공유
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");			
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 동등합니다.");
		}
		
		// 객체 영역에 객체 생성
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 동등합니다.");
		} 
		
		if(strVar3 == strVar4){
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
	}
}
