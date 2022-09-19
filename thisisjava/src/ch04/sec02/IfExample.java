package ch04.sec02;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		score = 55;
		if( score >= 60) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("아쉽게도 불합격입니다.");
		}
		System.out.println("지원해 주셔서 감사합니다.");
	}// main method의 끝
}
