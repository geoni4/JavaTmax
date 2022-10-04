package ch14.sec06.exam01;

public class SynchronizedExample {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalculator(calc);
		user1Thread.start();
		
		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalculator(calc);
		user2Thread.start();
		//순서가 보장되지 않으므로
		// 공유 객체의 메소드를 동기화 하든지
		// 동기화 블럭을 사용해 변경해줘야함..
	}
}
