package ch08.sec11.exam01;

public class Car {
	//필드
	Tire tire1 = new HankookTire();	//필드 초기화
	Tire tire2 = new HankookTire();
	
	void run() {
		tire1.roll();
		tire2.roll();
	}
}
