package ch08.sec05;

public interface RemoCon {
	public static final int MAX_VOLUME = 10;//상수. 초기화 하지 않으면 오류가 난다. 컴파일 시 강제로 static final이 붙음
	int MIN_VOLUME = 0;//상수
	
	//추상 메소드
	void turnOn();
	
	//default 메소드
	default void setVolume(int volume) {
		System.out.println("디폴트 메소드입니다.");
	} // interface에서 실체를 가진 method
	
	//static 메소드
	static void staticMethod() {
		System.out.println("정적 메소드입니다.");
	}
}
