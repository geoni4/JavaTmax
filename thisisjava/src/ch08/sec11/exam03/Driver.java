package ch08.sec11.exam03;

public class Driver {
	void drive(Vehicle v) {
		v.run();
		//bus일 때만 존재하므로 불가능. instanceof 써야함
		//참조변수 instanceof 클래스
		//참조변수가 클래스로 변환가능하면 true
		if(v instanceof Bus b) { //java 12에서 도입 됨
			b.checkFare();
		}
		
	}
}
