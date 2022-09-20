package ch04.sec07;

public class BreakExample3 {
	public static void main(String[] args) {
		int i = 2;
		label: while(i <= 9) {
			int j = 1;
			while(true) {
				System.out.print(i+"x"+j+"="+(i*j)+ "\t");
				if(j == 9) {break label;}
				j++;
			}
			//i++;
			//System.out.println();
		}
	}
}
