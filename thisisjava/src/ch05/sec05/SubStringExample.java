package ch05.sec05;

public class SubStringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		
		//substring(시작, 끝)
		String firstNum = ssn.substring(0, 6);	//시작 <= 범위 < 끝
		String secondNum = ssn.substring(7);
		
		//substring(시작)
		System.out.println(firstNum);
		System.out.println(secondNum);
	}
}
