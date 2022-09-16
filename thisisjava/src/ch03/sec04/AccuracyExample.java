package ch03.sec04;

public class AccuracyExample {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);

		System.out.println("------------------");
		
		// 실수 계산 시 오차 범위 내 소숫점 자리 수 만큼 10의 배수를 곱한 후 연산한 결과를 곱한 10의 배수를 나눠서 실수로 변환한다.
		// 그렇게 하지 않으면 오차가 발생. 소숫점에서 발생할 수 있는 문제기 때문에 확인할 것.
		int totalPieces = apple*10;
		int result2 = totalPieces - number;
		System.out.println("사과 1개에서 남은 양: " + result2/10.0);
		
		
	}
}
