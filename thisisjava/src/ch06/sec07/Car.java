package ch06.sec07;


// overloading
public class Car {
	//static 영역에는 동일한 이름의 변수, 메소드, 클래스
	//는 하나만 로드 됨.
	
	// 생성자 선언부 <- signature가 다르면 다른 생성자로 인식(jvm)
	// load와 생성의 시기가 다르다.
	Car(){}
	Car(String model){}
	Car(String model, String color){}
	Car(String model, int maxSpeed){}
	Car(int maxSpeed, String model){}
	Car(String model, String color, int maxSpeed){}
}
