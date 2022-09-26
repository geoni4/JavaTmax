package ch06.ex20;

public class Account {
	private String accountNumber;
	private String owner;
	private int balance;
	
	public Account(String accountNumber, String owner, int balance) {
		this.accountNumber=accountNumber;
		this.owner=owner;
		this.balance=balance;
	}
	
	
	@Override
	public String toString() {
		return accountNumber + "\t" + owner + "\t" + balance;
	}


	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public boolean withdraw(int balance) {
		if(getBalance() >= balance) {
			setBalance(getBalance() - balance);
			return true;
		}
		else {
			System.out.println("금액 확인 후 다시 입력하세요");
			return false;
		}
	}
	public boolean deposit(int balance) {
		if(balance >= 0) {
			setBalance(balance + getBalance());
			return true;
		}
		else {
			System.out.println("금액 확인 후 다시 입력하세요");
			return false;
		}
	}
	public boolean certAccount(String newAccountNumber, Account account) {
		if(account == null)
			return false;
		if(newAccountNumber.equals(account.getAccountNumber()))
			return true;
		return false;
	}
}