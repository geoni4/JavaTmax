package ch06.sec15;

public class Singleton {
	
	//private 접근 제한자로 static instance 선언
	private static Singleton instance;
	
	//private 접근 제한자로 생성자 선언
	private Singleton() {
		
	}
	
	//public 접근 권한을 가진 static 메소드 선언
	public static Singleton getInstance() {
		if(instance == null) instance = new Singleton();
		return instance;
	}
}
