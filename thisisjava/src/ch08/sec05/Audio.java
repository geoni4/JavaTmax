package ch08.sec05;

public class Audio implements RemoCon {
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println(this.getClass().getSimpleName()+"를 켭니다.");

	}

//	@Override
//	public void setVolume(int volume) {
//
//	}

}
