package ch02.sec13;

import java.util.Scanner;

//Scanner로 두 정수를 입력 받아 곱한 결과를 출력하도록 작성하고 
public class ScannerExample2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력 하시오");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.println("두번째 정수를 입력 하시오");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x*y;
		System.out.printf("%d와 %d의 곱: %6d\n", x, y, result);
	
	}
}
