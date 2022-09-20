package ch04.sec07;

public class BreakOutterExample {
	public static void main(String[] args) {
		int i = 2;
		
		while(i<=9) {
			int j = 1;
			while(true) {
				System.out.println("i+j");
				if(j==9) {break;}
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
