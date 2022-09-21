package ch05.sec07;

public class MultiDimensionalArrayByNewExample2 {
	public static void main(String[] args) {
		int[] [] mathScores = new int[2][3];
		//[0][0][0]
		//[0][0][0]
		//배열 항목 값 변경
		mathScores[0][0] = 80;	mathScores[0][1] = 83;	mathScores[0][2] = 85;
		mathScores[1][0] = 86;	mathScores[1][1] = 90;	mathScores[1][2] = 92;
		
		//합과 평균 구하기
		int mathSum = 0;
		int students = 0;
		for(int i =0;i<mathScores.length;i++) {
			for(int j = 0;j<mathScores[i].length;j++) {
				mathSum += mathScores[i][j];//mathSum = mathSum + mathScores[i][j];
				students += 1;
			}
		}
		System.out.println("전체 합: " + mathSum);
		System.out.println("전체 평균: " + mathSum/(double)students);
		
		String[] names = {"홍길동", "일지매", "임꺽정"};
		int[][] scores = {{80, 83, 85}, {86, 90, 92}, {88, 87, 95}};
		System.out.println("-----------------성적표--------------------");
		System.out.println("| 이름\t| 국어\t| 영어\t| 수학\t| 총점\t|");
		System.out.println("-----------------------------------------");
		int[] colSum = new int[scores.length];
		int totalSum =0;
		for(int i = 0;i<scores.length; i++) {
			int sum=0;
			System.out.print("| " + names[i] + "\t|");
			for(int j =0; j<scores[i].length;j++) {
				System.out.print(" " + scores[i][j] + "\t|");				
				sum += scores[i][j];
				colSum[j] += scores[i][j];
				if(i == scores.length-1) {
					totalSum += colSum[j];					
				}
			}
			System.out.print(" " + sum +"\t|\n");
		}
		
		System.out.println("-----------------------------------------");
		System.out.print("| 총합\t|");
		for(int i =0;i<colSum.length;i++) {
			System.out.print(" "+colSum[i] + "\t|");			
		}
		System.out.print(" " + totalSum +"\t|\n");
		System.out.println();
	}
}
