package ch06.ex20;

import java.util.Scanner;

public class BankApplication {
	static final String BANK_NUMBER="111-";
	static int seq = 0;
	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		Account[] accounts = new Account[100];
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("| 1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료 |");
			System.out.println("---------------------------------------------------");
			System.out.print("선택> ");
			String strMenuNum = scanner.nextLine();
			switch(strMenuNum){
			case "1":
				createAccount(accounts, scanner);
				break;
			case "2":
				listAccount(accounts);
				break;
			case "3":
				depositMoney(accounts, scanner);
				break;
			case "4":
				withdrawMoney(accounts, scanner);
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
	static void createAccount(Account[] accounts, Scanner scanner) {
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		//계좌 생성
		String tmpAccountNumber = BANK_NUMBER+(++seq)+seq+seq;
		for(Account checkAcc: accounts) {
			if(checkAcc == null) continue;
			if(checkAcc.certAccount(tmpAccountNumber, checkAcc)){
				System.out.println("이미 존재하는 계좌번호 입니다. 다시 생성하세요.");
				return;
			}
		}
		for(int i = 0;i<accounts.length;i++) {
			if(accounts[i] == null) {
				System.out.print("계좌주: ");
				String tmpOwner = scanner.nextLine();
				System.out.print("초기입금액: ");
				int tmpBalance = Integer.parseInt(scanner.nextLine());
				Account tmpAccount = new Account(tmpAccountNumber, tmpOwner, tmpBalance);
				accounts[i] = tmpAccount;
				System.out.println("결과: 계좌가 생성되었습니다.");
				return;
			}
		}

	}

	static void listAccount(Account[] accounts) {
		System.out.println("----------");
		System.out.println("계좌목록");
		System.out.println("----------");
		for(Account account:accounts) {
			if(account == null) continue; //참조타입 변수 배열 - null여부 확인
			System.out.println(account.toString());
		}
	}
	static void depositMoney(Account[] accounts, Scanner scanner) {
		System.out.println("----------");
		System.out.println("예금");
		System.out.println("----------");
		System.out.print("계좌번호: ");
		String tmpAccountNumber = scanner.nextLine();
		//tmpAccount.setAccountNumber(scanner.nextLine());
		for(Account usedAcc: accounts) {
			if(usedAcc == null ) continue;
			if(usedAcc.certAccount(tmpAccountNumber, usedAcc)) {
				System.out.print("예금액: ");
				if(usedAcc.deposit(Integer.parseInt(scanner.nextLine())));
					System.out.println("예금 성공");
				System.out.println("잔액: " + usedAcc.getBalance());
				return;
			}
		}
		System.out.println("계좌번호가 없습니다.");
		System.out.println("메뉴 화면으로 돌아갑니다.");
		return;
	}
	static void withdrawMoney(Account[] accounts, Scanner scanner) {
		System.out.println("----------");
		System.out.println("출금");
		System.out.println("----------");
		System.out.print("계좌번호: ");
		String tmpAccountNumber = scanner.nextLine();
		//tmpAccount.setAccountNumber(scanner.nextLine());
		for(Account usedAcc: accounts) {
			if(usedAcc == null ) continue;
			if(usedAcc.certAccount(tmpAccountNumber, usedAcc)) {
				System.out.print("출금액: ");
				if(usedAcc.withdraw(Integer.parseInt(scanner.nextLine())))
					System.out.println("출금 성공");
				System.out.println("잔액: " + usedAcc.getBalance());
				return;
			}
		}
		System.out.println("계좌번호가 없습니다.");
		System.out.println("메뉴 화면으로 돌아갑니다.");
		return;
	}
	//함수를 이용하여 더 간단히 해보자
	static boolean findAccount(Account[] accounts, String findAccountNumber) {
		for(Account usedAcc: accounts) {
			if(usedAcc.certAccount(findAccountNumber, usedAcc)) {
				return true;
			}
		}
		return false;
	}
}