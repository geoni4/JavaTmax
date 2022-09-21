package ch05.sec10;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		int sum=0;
		//기본 for문
		for(int i =0; i<scores.length;i++) {
			System.out.print(scores[i] + " ");
			sum += scores[i];
		}
		System.out.println("총합: " +sum + ", 평균: " + (sum/(double)scores.length));
		System.out.println();
		//향상된 for문
		//python for문과 비슷
		sum =0;
		for(int score:scores) {
			System.out.print(score + " ");
			sum += score;
		}
		System.out.println("총합: " +sum + ", 평균: " + (sum/(double)scores.length));
		System.out.println();
	}
}