package ch04.ex;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		while(true) {
			System.out.printf("합이 5가 될 때까지 주사위를 굴립니다.(아무 키나 누르세요.)");
			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			int dice1 = (int)(Math.random() * 6 + 1);
			int dice2 = (int)(Math.random() * 6 + 1);
			System.out.printf("(%d, %d)\n", dice1, dice2);
			if(dice1+dice2 == 5) {
				System.out.println("합이 5. 종료합니다.");
				break;
			} else {
				System.out.println("합이 5가 아닙니다.\n");
			}
		}
	}
}
