package ch04.ex;

import java.util.Scanner;

public class Example7 {
	public static void main(String[] args) {
			boolean run = true;
			Scanner scanner = new Scanner(System.in);
			String strMenuNum;
			int deposit = 0;
			while(run) {
				System.out.println("---------------------------------");
				System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
				System.out.println("---------------------------------");
				System.out.print("선택> ");
				strMenuNum = scanner.nextLine();
				if("1".equals(strMenuNum)) {
					System.out.print("예금액>");
					String strDeposit = scanner.nextLine();
					int depositMoney = Integer.parseInt(strDeposit);
					deposit += depositMoney;
				} else if("2".equals(strMenuNum)) {
					System.out.print("예금액>");
					String strWithdrawMoney = scanner.nextLine();
					int withdrawMoney = Integer.parseInt(strWithdrawMoney); 
					if(deposit < withdrawMoney) {
						System.out.println("출금할 수 없습니다."); 
						System.out.println("인출 요청액이 예금액보다 많습니다.");
					} else {
						deposit -= withdrawMoney;	
					}
				} else if("3".equals(strMenuNum)) {
					System.out.printf("예금액>%d\n", deposit);
				} else if("4".equals(strMenuNum)) {
					System.out.println();
					run = !run;
					System.out.println("프로그램 종료");
				}
				System.out.println();
			}
	}
}
