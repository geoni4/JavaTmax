package ch06.sec07_01;

public class Car {
	//필드 선언
	String company;
	String model;	//null
	String color;	//null
	int maxSpeed;	//0
	

	//생성자
	//this() 메소드는 다른 생성자 호출 시 사용
	//this() 메소드는 반드시 첫 줄에 적어야한다.
	public Car() {
		this.company = "H자동차";
	}
	public Car(String model) {// parameter인 String model은 로컬변수
		this();
		this.model = model;
	}
	public Car(String model, String color) {
		this(model);
		this.color = color;
	}
	public Car(String model, String color, int maxSpeed) {
		this(model, color);
		this.maxSpeed = maxSpeed;
	}
	
	
	@Override //컴파일러가 이해하는 주석
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}

	
}
