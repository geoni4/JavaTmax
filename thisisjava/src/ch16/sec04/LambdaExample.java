package ch16.sec04;

public class LambdaExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		
		person.action((x, y) -> {
			double result = x + y ;
			return result;
		});
		
		person.action((x, y) ->	x + y);
		//return 생략 가능
		
		person.action(new Calculable(){
			@Override
			public double calc(double x, double y) {
				return sum(x, y);
			}
		});
		
		person.action((x, y) -> sum(x, y));
		
	}
	
	public static double sum(double x, double y) {
		return x+y;
	}
}
