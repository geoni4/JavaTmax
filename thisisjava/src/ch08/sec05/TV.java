package ch08.sec05;

public class TV implements RemoCon {
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println(this.getClass().getSimpleName()+"를 켭니다.");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println(this.getClass().getSimpleName()+"의 볼륨을 올립니다.");
		this.volume = volume;
	}

}
