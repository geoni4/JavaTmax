package ch07.sec08.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		//필드를 객체로 초기화
		myCar.tire = new Tire();
		
		//run()메소드 실행
		myCar.run();
		
		//필드를 객체로 초기화
		myCar.tire = new HankookTire();
		//override된 HankookTire의 method로 실행됨(Tire의 run method가 HankookTire의 run method로 override됨)
		myCar.run();
		
		//필드를 객체로 초기화
		myCar.tire = new KumhoTire();
		//override된 KumhoTire의 method로 실행됨(Tire의 run method가 KumhoTire의 run method로 override됨)
		myCar.run();
	}
}
