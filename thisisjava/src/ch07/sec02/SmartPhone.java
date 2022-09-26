package ch07.sec02;

public class SmartPhone extends Phone {
	//필드
	public boolean wifi;// false
	
	public SmartPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	public SmartPhone(boolean wifi) {
		this.wifi = wifi;
	}

	//메소드
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
	
}
