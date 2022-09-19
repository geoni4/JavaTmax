package ch03.sec07;

public class LogicaOperationExample2 {

	public static void main(String[] args) {
		int x = -1;
		int y = 1;
		if(y!=1 && (10/++x)==1) { // false &, &&
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		x = -1;
		
		if(y == 1 || (10/++x) == 1) {// |, ||
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
