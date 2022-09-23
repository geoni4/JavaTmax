package ch06.ex20;

public class Account {
	private String accountNumber;
	private String owner;
	private int balance;
	
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
	public void withdraw(int balance) {
		if(getBalance() >= balance) setBalance(getBalance()- balance);
		else System.out.println("금액 확인 후 다시 입력하세요");
	}
	public void deposit(int balance) {
		if(balance >=0) setBalance(balance+getBalance());
		else System.out.println("금액 확인 후 다시 입력하세요");
	}
	public boolean certAccount(String accountNumber) {
		if(accountNumber.equals(this.accountNumber))
			return true;
		else
			return false;
	}
}
