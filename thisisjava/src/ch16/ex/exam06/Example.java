package ch16.ex.exam06;


public class Example {
	public static double calc(Function fun) {
		double x = 10;
		double y = 4;
		return fun.apply(x, y);
	}
	
	public static void main(String[] args) {
		double result = calc( (x, y) -> (x / y) );
		System.out.println("result: " + result);
	}
}

interface Function {	
	public double apply(double x, double y);
}
