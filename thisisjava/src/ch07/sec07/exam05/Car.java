package ch07.sec07.exam05;

public class Car {
	public int speed;
	
	public void speedUp() {
		speed++;
	}
	
	//method 앞에 final을 붙이면 재정의(override)가 불가
	public final void stop() {
		System.out.println("정지");
		speed = 0;
	}
}
