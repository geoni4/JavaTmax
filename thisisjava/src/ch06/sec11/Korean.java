package ch06.sec11;

public class Korean {
	//final로 선언한 필드는 선언과 동시에 초기화
	//final은 수정 불가 그러므로 setter 불가
	String nation = "대한민국";
	
	//instance마다 생성되는 final 필드
	// instance init block으로 초기화 할 수 있음
	String ssn;
	
	
	
	String name;
	//생성자
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	
	
	public String getNation() {
		return nation;
	}



	public void setNation(String nation) {
		this.nation = nation;
	}



	public String getSsn() {
		return ssn;
	}



	public void setSsn(String ssn) {
		this.ssn = ssn;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static void main(String[] args) {
		Korean korean1 = new Korean("2001011234567", "홍길동");
		System.out.println(korean1.getName());

		Korean korean2 = new Korean("2001011234567", "김길동");
	}
}
