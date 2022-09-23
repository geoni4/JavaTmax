package ch06.ex20;

import java.util.Scanner;

public class BankApplication {
	public static void main(String[] args) {
		//Account[] accounts = new Account[10];
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		Account account = new Account();
		while(run) {
			System.out.print("선택> ");
			String strMenuNum = scanner.nextLine();
			System.out.println("----------");
			System.out.println("계좌생성");
			System.out.println("----------");
			
			
			switch(strMenuNum){
			case "1":
				System.out.println("----------");
				System.out.println("계좌생성");
				System.out.println("----------");
				System.out.print("계좌번호: ");
				account.setAccountNumber(scanner.nextLine());
				System.out.print("계좌주: ");
				account.setOwner(scanner.nextLine());
				System.out.print("초기입금액: ");
				account.setBalance(Integer.parseInt(scanner.nextLine()));
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			case "2":
				System.out.println("----------");
				System.out.println("계좌목록");
				System.out.println("----------");
				System.out.println(account.getAccountNumber() + "\t" + account.getOwner() + "\t" + account.getBalance());
				break;
			case "3":
				System.out.println("----------");
				System.out.println("예금");
				System.out.println("----------");
				System.out.print("계좌번호: ");
				if(account.certAccount(scanner.nextLine())) {
					System.out.print("예금액: ");
					account.deposit(Integer.parseInt(scanner.nextLine()));
					System.out.println("예금 성공");
					System.out.println("잔액: " + account.getBalance());
				} else {
					System.out.println("계좌번호가 없습니다.");
					System.out.println("메뉴 화면으로 돌아갑니다.");
				}
				break;
			case "4":
				System.out.println("----------");
				System.out.println("출금");
				System.out.println("----------");
				System.out.println("계좌번호: ");
				if(account.certAccount(scanner.nextLine())) {
					System.out.print("출금액: ");
					account.withdraw(Integer.parseInt(scanner.nextLine()));
					System.out.println("출금 성공");
					System.out.println("잔액: " + account.getBalance());
				} else {
					System.out.println("계좌번호가 없습니다.");
					System.out.println("메뉴 화면으로 돌아갑니다.");
				}
				break;
			case "5":
				System.out.println("프로그램 종료");
				run = !run;
				break;
			default:
				System.out.println("번호를 확인 후 입력하세요.");
				break;
			}
			
		}
	}
	void createAccount() {
		
	}
	
	void listAccount() {
		
	}
	void deposit(Account account, Scanner scanner) {
		
	}
	void withdraw(Account account, Scanner scanner) {
		System.out.println("----------");
		System.out.println("출금");
		System.out.println("----------");
		System.out.println("계좌번호: ");
		account.setAccountNumber(scanner.nextLine());
		System.out.println("출금액: ");
		account.setBalance(Integer.parseInt(scanner.nextLine()));
		System.out.println("결과: 출금이 성공했습니다.");
	}
}
