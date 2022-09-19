package ch04.sec03;

public class SwitchValueExample {
	public static void main(String[] args) {
		String grade = "B";
		//Java 11 이전 버전 문법
		
		int score1 = 0;
		switch(grade) { //switch문에 char, int만 사용했었으나(1.7버전 이전), String도 사용가능함(1.7버전 이후)
		case "A":
			score1 = 100;
			break;
		case "B":
			int result = 100 - 20;
			score1 = result;
			break;
		default:
			score1 = 60;
		};
		
		System.out.println("score1: " + score1);
		
		//Java 12 이후
		int score2 = switch(grade) {
		case "A" -> 100;
		case "B" -> {
			int result = 100 - 20;
			//Java 13 이후
			yield result;
		}
		default -> 60;
		};
		System.out.println("score2: " + score2);
	}
}
