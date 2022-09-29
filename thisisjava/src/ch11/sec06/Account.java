package ch11.sec06;

public class Account {
	private long balance;
	public Account() {
		
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	//예외 떠넘기기
	public void withdraw(int money) throws Exception {
		if( balance<money) {
			throw new Exception("잔고가 부족합니다.");	//강제 예외 발생
			//throw new 예외객체 생성자;
		}
		balance -= money;
	}
}
