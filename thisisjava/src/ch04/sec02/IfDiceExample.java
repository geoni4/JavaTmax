package ch04.sec02;

public class IfDiceExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;
		
		System.out.printf("%d번 나왔습니다.", num);
	}
}
