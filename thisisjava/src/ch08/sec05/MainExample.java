package ch08.sec05;

public class MainExample {
	public static void main(String[] args) {
		RemoCon rc = new Audio();
		rc.turnOn();
		
		
		//tvi
		rc = new TV();
		rc.turnOn();
		rc.setVolume(10);
		
		//정적 메소드 실행
		//interface.staticmethod
		RemoCon.staticMethod();
	}
}
