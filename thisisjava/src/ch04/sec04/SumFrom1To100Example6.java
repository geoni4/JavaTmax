package ch04.sec04;

public class SumFrom1To100Example6 {
	public static void main(String[] args) {
		int sum;
		int i;
		for(sum = 0, i =1;;) {
			if(i>100) {break;}
			sum+=i;
			i++;
		}
		System.out.println("합: " + sum);
	}
}
