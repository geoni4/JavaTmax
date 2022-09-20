package ch05.sec06;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87};
		
		int sum1 = 0;
		for(int i = 0; i < scores.length; i++) {
			sum1 += scores[i];	//sum1 = sum1 + scores[i];
		}
		System.out.println("총합: " + sum1);
		
		//printItem() 호출 - 같은 class내의 다른 method 호출 function(params);
		printItem(new int[] {83, 90, 87});
		int[] arr = {1, 2, 3};
	}
		
	static void printItem(int[] scores) {
		for(int i =0; i<scores.length; i++)
			System.out.println(scores[i] + " ");
		System.out.println();
	}
	
	
}
