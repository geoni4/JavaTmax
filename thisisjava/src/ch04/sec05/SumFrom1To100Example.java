package ch04.sec05;

public class SumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		//while(조건) {실행문; 증강문;}
		while(i <= 100 ) {
			sum += i;
			i++;
		}
		
		System.out.println("1에서 " + (i-1) + "까지의 합: " + sum);
	}
}
