package ch08.verify.exam05;

public class MainExample {
	public static void main(String[] args) {
		Remocon rc = new TV();
		rc.turnOn();
		
		rc = () -> 	System.out.println("TV를 켰습니다.");
		rc.turnOn();
	}
}
