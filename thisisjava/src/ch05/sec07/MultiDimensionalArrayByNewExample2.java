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
		
		String[] names = {"홍길동", "일지매", "임꺽정", "김길동"};
		int[][] scores = {{80, 83, 85}, {86, 90, 92}, {88, 87, 95}, {80, 87, 90}};
		System.out.println("---------------------성적표-----------------------");
		System.out.println("| 이름\t| 국어\t| 영어\t| 수학\t| 총점\t| 평균\t|");
		System.out.println("-------------------------------------------------");
		int subjects = scores[0].length;
		int[] colSum = new int[subjects];
		int totalSum =0;
		for(int i = 0;i<names.length; i++) {
			int sum=0;
			int j = 0;
			System.out.print("| " + names[i] + "\t|");
			for(int score:scores[i]) {
				System.out.print(" " + score + "\t|");
				
				colSum[j++] += score;
				sum += score;
				totalSum += score;
			}
			System.out.print(" " + sum +"\t|");
			System.out.printf("%6.2f\t|\n", (double)sum/subjects);
		}
		System.out.println("-------------------------------------------------");
		System.out.print("| 총합\t|");
		for(int i =0;i<subjects;i++) {
			System.out.print(" "+colSum[i] + "\t|");			
		}
		System.out.printf(" %d\t|%6.2f\t|\n", totalSum, (double)totalSum/(names.length*subjects));
		System.out.println("-------------------------------------------------");
		System.out.println();
	}
}
