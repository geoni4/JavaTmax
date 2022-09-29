package ch11.sec06;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(1000);
		try {
			//throws 선언된 메소드를 호출하는 곳에서는 반드시 예외 처리를 해줘야 됨
			account.withdraw(5000);	
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
