package ch04.ex;

public class Example6 {
	public static void main(String[] args) {
		for(int n = 1 ; n <= 5; n++) {
			for(int m = 1; m <= n; m++) {
				System.out.print("*");	
			}
			System.out.println();
		}
	}
}
