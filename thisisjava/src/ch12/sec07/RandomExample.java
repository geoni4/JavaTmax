package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		// 선택번호
		int[] selectNumber = new int[6];
		
		
		//seed가 같으면 반복해도 일정한 난수가 생성된다.
		//seed가 없거나 다르면 반복할 때마다 다른 난수가 생성
		Random random; // 난수 발생 0.0 <= 난수 < 1.0
		
		for(int j = 11; j<=20;j++) {
			random = new Random(j);
			for(int i =0;i<6;i++) {
				selectNumber[i] = random.nextInt(45) + 1;
			}
			
			
			//당첨번호
			
			int[] winningNumber = new int[6];
			random = new Random(5);
			
			
			for(int i =0;i<6;i++) {
				winningNumber[i] = random.nextInt(45) + 1;
			}
			Arrays.sort(selectNumber);
			Arrays.sort(winningNumber);
			System.out.println("선택번호: " + Arrays.toString(selectNumber));
			System.out.println("당첨번호: " + Arrays.toString(winningNumber));
			
			System.out.println(Arrays.equals(selectNumber, winningNumber)? "1등 당첨" : "안 당첨");
			
		}
	}
}
