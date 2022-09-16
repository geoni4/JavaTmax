package ch02.sec13;

import java.util.Scanner;

//Scanner로 두 정수를 입력 받아 곱한 결과를 출력하도록 작성하고 
public class ScannerExample2 {
	public static void main(String[] args) {
		//스캐너 생성
		Scanner scanner = new Scanner(System.in);
		int x, y;
		
		//입력
		System.out.println("첫번째 정수를 입력 하시오");
		String strX = scanner.nextLine();
		System.out.println("두번째 정수를 입력 하시오");
		String strY = scanner.nextLine();
		
		
		 
		
		//파싱 후 변환
		x = Integer.parseInt(strX);
		y = Integer.parseInt(strY);
		
		int result = x*y;
		
		//결과
		System.out.printf("%d와 %d의 곱: %6d\n", x, y, result);
	
	}
}
