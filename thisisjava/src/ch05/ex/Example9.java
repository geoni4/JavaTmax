package ch05.ex;

import java.util.Scanner;

public class Example9 {
	//필드(global) 선언 후 명시적으로 초기화하지 않아도 jvm에서 자동 초기화 해줌
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String strMenuNum, strStudents, strScores;
		int students = 0, maxScore = 0, i = 0;
		boolean run = true;
		double avgScore = 0.0;
		int[] scores = null;
		while(run) {
			System.out.println("\n-----------------------------------------------------");
			System.out.println("1. 학생 수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택> ");
			strMenuNum = scanner.nextLine();
			switch(strMenuNum) {
			case "1":
				while(true) {
					try{
						System.out.print("학생수> ");
						strStudents = scanner.nextLine();
						students = Integer.parseInt(strStudents);
						
						if(students < 1) {
							System.out.println("다시 입력하세요.");
							continue;
						}
						scores = new int[students];
					} catch(Exception e){
						System.out.println("숫자를 입력하세요.");
					}
					break;
				}
				break;
			case "2":
				if(scores == null) {
					System.out.println("학생 수 먼저 입력하세요.");
					continue;
				}
				i = 0;
				while(true) {
					if(i >= students) {
						break;
					}
					System.out.printf("scores[%d]> ", i);
					strScores = scanner.nextLine();
					scores[i] = Integer.parseInt(strScores);
					if(scores[i] < 0) {
						System.out.println("다시 입력하세요.");
						continue;
					}
					i++;
				}
				break;
			case "3":
				if(scores == null) {
					System.out.println("학생 수 먼저 입력하세요.");
					continue;
				}
				for(i =0; i<students;i++)	System.out.printf("scores[%d]: %d\n", i, scores[i]);
				break;
			case "4":
				if(scores == null) {
					System.out.println("학생 수 먼저 입력하세요.");
					continue;
				}
				int result = 0;
				for(i =0; i<students; i++) {
					if(maxScore < scores[i])
						maxScore = scores[i];
					result += scores[i];
				}
				avgScore = (double)result/students;
				System.out.printf("최고 점수: %d\n", maxScore);
				System.out.printf("최고 점수: %.1f\n", avgScore);
				break;
			case "5":
				System.out.println("프로그램 종료");
				run = !run;
				break;
			default:
				System.out.println("번호 확인 후 다시 입력하세요.");		
			}			
		}
	}
}
