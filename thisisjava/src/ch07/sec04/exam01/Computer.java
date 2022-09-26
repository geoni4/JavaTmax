package ch07.sec04.exam01;

//override
public class Computer extends Calculator {
	
//	public double circleArea(double radius) {
//		System.out.println("재정의된 메소드");
//		return Math.PI*Math.pow(radius, 2);
//	}
	//@Override는 컴파일러에게 부모 클래스의 메소드가
	//자식 클래스에서 재정의 되었음을 알려주는 역할
	@Override//어노테이션 (컴파일러에게 알려주는 주석)
	public double circleArea(double radius) {
		return Math.PI*Math.pow(radius, 2);
	}
	
	public int circleArea(float radius) {
		return (int)(Math.PI*Math.pow(radius, 2));
	}
	
	public double circleArea(int radius) {
		return Math.PI*Math.pow(radius, 2);
	}
	
	public static void main(String[] args) {
		Computer c1 = new Computer();
		
		double area = c1.circleArea(10);
		System.out.println(area);
	}

}


