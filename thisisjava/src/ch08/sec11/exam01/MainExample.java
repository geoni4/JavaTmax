package ch08.sec11.exam01;

public class MainExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		
		// tire1을 kumho tire로 교체
		myCar.tire1 = new KumhoTire();
		
		myCar.run();
	}
}
