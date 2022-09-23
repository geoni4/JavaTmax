package ch06.sec08;

public class ComputerExample {
	//가변 길이 매개변수 -> 값 입력시 (값1, 값2, 값3, 값4, 값5) 이런 식으로. => 배열 생성되어 실행블럭에 전달
	int sumAll(int ... args) {
		int sum = 0;
		for(int a:args) sum+=a;
		return sum;
	}
	
	public static void main(String[] args) {
		ComputerExample ce = new ComputerExample();
		int result = ce.sumAll(1, 2, 3, 4, 5);//[1][2][3][4][5]
		
		System.out.println(result);
		
		result = ce.sumAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(result);
		
		System.out.println(ce.sumAll());
		
		System.out.println(ce.sumAll(new int[] {1, 2, 3, 4, 5}));
		
	}
}


