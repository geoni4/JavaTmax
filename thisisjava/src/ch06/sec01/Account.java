package ch06.sec01;

//은행 업무 - 객체화
public class Account {
	//클래스 내부에 선언된 변수 - 필드(field) 
	private String owner;	//소유자
	private int balance;	//잔고
	private String sno;		//계좌번호
	//캡슐화(은닉화) -접근 제한자 설정
	
	
	//생성자
	public Account(String owner, int balance, String sno) {
		this.owner = owner;
		this.balance = balance;
		this.sno = sno;
	}
	
	
//메소드	
public String getOwner() {return owner;}
public int getBalance() {return balance;}
public String getSno() {return sno;}

public int withdraw(int amount) {
	if(balance - amount<0)
		System.out.println("잔고가 모자랍니다.");
	else
		balance -= amount;
	return getBalance();
}

public int saveMoney(int amount) {
	balance += amount;
	return getBalance();
}





	
}
