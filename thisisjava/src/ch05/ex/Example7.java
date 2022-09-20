package ch05.ex;

public class Example7 {
	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2};
		int result = 0;
		for(int i =0; i<array.length;i++){
			if(array[i] > result){
				result = array[i];
			}
		}
		System.out.println(result);
	}
}
