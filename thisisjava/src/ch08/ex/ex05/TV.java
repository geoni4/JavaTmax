package ch08.ex.ex05;

public class TV implements Remocon{
	
	@Override
	public void powerOn() {
		System.out.println(this.getClass().getSimpleName() + "를 켰습니다.");
	}
	
	public static void main(String[] args) {
		Remocon r = new TV();
		r.powerOn();
	}
}
