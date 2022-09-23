package ch06.sec08_04;

public class Calculator {
	
	//오버로딩
	
	
	double areaRectangle(double width) {//signature 선언문
		return width*width;
	}
	
	double areaRectangle(double width, double height) {
		return width*height;
	}
	
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.areaRectangle(100));
		System.out.println(calc.areaRectangle(100, 200));
	}
}
