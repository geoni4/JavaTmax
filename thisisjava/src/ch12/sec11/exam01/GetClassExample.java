package ch12.sec11.exam01;

public class GetClassExample {
	public static void main(String[] args) throws Exception {
		Class clazz = Car.class;	//클래스 정보로부터 값을 얻는다.
		
		System.out.println("패키지: " + clazz.getPackageName());
		System.out.println("클래스 이름: " + clazz.getSimpleName());
		System.out.println("클래스 경로 및 이름: " + clazz.getName());
		
		// 문자열로부터 값 얻기
		Class clazz2 = Class.forName("ch12.sec11.exam01.Car"); 
		
		System.out.println("패키지: " + clazz2.getPackageName());
		System.out.println("클래스 이름: " + clazz2.getSimpleName());
		System.out.println("클래스 경로 및 이름: " + clazz2.getName());
		
		
		// Car의 인스턴스 생성
		Car car2 = (Car)clazz2.newInstance();
		
		// Car s인스턴스로부터 값 얻기
		Car car = new Car();
		
		Class clazz3 = car.getClass();
		System.out.println("패키지: " + clazz3.getPackageName());
		System.out.println("클래스 이름: " + clazz3.getSimpleName());
		System.out.println("클래스 경로 및 이름: " + clazz3.getName());

		
	}
}
