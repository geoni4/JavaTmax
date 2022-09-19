package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		int speed = 0;
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("------------------------");
			System.out.println("선택: ");
			
			
			//키보드로부터 값 입력 받기
			String strNum = scanner.nextLine();
			
			if("1".equals(strNum)) {
				speed++;
			} else if("2".equals(strNum)) {
				if(speed--<=0) speed=0;
			} else if("3".equals(strNum)) {
				run = !run;
				continue;
			}
			System.out.println("현재 속도 = " + speed);
		}
		System.out.println("프로그램 종료");
		
	}
}
