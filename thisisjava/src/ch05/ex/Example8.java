package ch05.ex;

public class Example8 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum =0;
		int num =0;
		for(int i =0;i<array.length; i++){
		    for(int j =0;j<array[i].length;j++){
		        sum += array[i][j];
		        num += 1;
		    }
		}
		double avg = (double) sum / num;
		System.out.println("전체 합: " + sum);
		System.out.println("평균: " + avg);
	}
}
