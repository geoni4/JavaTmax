package ch05.verify;

import java.util.Arrays;

public class Exam07 {
	public static void main(String[] args) {
		int[] array = {1, 5, 3, 8, 2};
		
		
		// 최대값 구하기
		int max = 0;
		for(int i = 0;i <array.length;i++) {
			if(max<array[i]) max = array[i];
		}
		
		// 최소값 구하기
		int min = 100;
		for(int i =0; i< array.length;i++) {
			if(min > array[i]) min = array[i];
		}
		
		// 오름차순 정렬
		
		for(int i =0; i< array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n---------");
		for(int i =0; i< array.length-1;i++) {
			for(int j =i+1; j<array.length;j++) {
				if(array[i]>array[j]) {
					int tmp = 0;
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		for(int i =0; i< array.length-1;i++) {
			for(int j =i+1; j<array.length;j++) {
				if(array[i]<array[j]) {
					int tmp = 0;
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		for(int i =0;i< array.length;i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n---------");
		Arrays.sort(array);
		for(int i =0;i< array.length;i++) {
			System.out.print(array[i] + " ");
		}
		
	}
}
