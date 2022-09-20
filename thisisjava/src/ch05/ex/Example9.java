package ch05.ex;

import java.util.Scanner;

public class Example9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String strMenuNum, strStudents;
		int students = 0;
		while(true) {
			System.out.println("\n-----------------------------------------------------------");
			System.out.println("1. 학생 수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------------------------");
			System.out.print("선택> ");
			strMenuNum = scanner.nextLine();
			if("1".equals(strMenuNum)) {
				while(true) {
					System.out.print("학생수> ");
					strStudents = scanner.nextLine();
					students = Integer.parseInt(strStudents);
					if(!(students >= 1)) {
						System.out.println("다시 입력하세요.");
					} else {
						break;
					}
				}
				
			}
		}
	}
}
