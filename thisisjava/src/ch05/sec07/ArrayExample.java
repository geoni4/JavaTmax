package ch05.sec07;

public class ArrayExample {
	public static void main(String[] args) {
		int[] arr = new int[3];
		
		arr[0] = 10;//arr 배열의 0번 인덱스의 값에 10을 더한 값을 대입
		arr[0] +=20;
		arr[0] +=30;
		
		arr[2] +=30;
		for(int i =0; i<arr.length;i++) 
			System.out.print(arr[i]+ " ");
		
		int result = arr[0] + arr[2];
		System.out.println(result);
	}
}
