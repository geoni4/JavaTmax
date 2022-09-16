package ch02.sec13;

import java.util.Scanner;


public class ScannerExample3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		//반복문
		while(run) {
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();
			if(data.equals("q")) {
				break;//반복문을 빠져 나가는 명령문
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
			
		}
		System.out.println("종료");
	}
}
