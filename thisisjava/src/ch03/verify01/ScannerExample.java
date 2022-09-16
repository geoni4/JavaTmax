package ch03.verify01;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		//초를 입력 받고 입력받은 초를 시 분 초로 나눠서 출력하는 p/g
		
		Scanner scanner = new Scanner(System.in);
		
		int hour, min, sec;
		System.out.println("시간을 입력하세요.(단위: 초)");
		while(true) {
			String strX = scanner.nextLine();
			if(strX.equals("q")) {
				break;
			}
			sec = Integer.parseInt(strX);
			hour = sec / (60 * 60);
			min = sec / 60 % 60 ;
			sec = sec % 60;
			if(hour != 0) {
				System.out.printf("%d시간 ", hour);	
			}
			if(hour != 0 || min != 0) {
				System.out.printf("%d분 ", min);
			}
			if(hour != 0 || min != 0 || sec != 0) {
				System.out.printf("%d초", sec);
			}
			System.out.println("\n");
		}
		
	}
}
