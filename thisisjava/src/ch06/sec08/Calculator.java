package ch06.sec08;

public class Calculator {
	int x;
	int y;
	//1. 매개변수를 받고 결과를 리턴하는 메소드
	int plus(int x, int y)//선언부
	{//실행(실체)부
		return x + y;
	}
	
	//2. 매개변수를 받고 결과를 리턴하지 않는 메소드
	void minus(int x, int y) {
		int result = x - y;
		System.out.println(result);
	}
	
	//3. 매개변수를 받지 않고 결과를 리턴하는 메소드
	int multiple() {
		return x*y;
	}
	
	//4. 매개변수를 받지 않고 결과를 리턴하지 않는 메소드
	void divide() {
		if(y != 0)
		System.out.println((double)x/y);
	}
}
