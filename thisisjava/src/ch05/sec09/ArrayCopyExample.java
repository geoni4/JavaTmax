package ch05.sec09;

public class ArrayCopyExample {
	public static void main(String[] args) {
		//얕은 복사(shallow)
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;
		arr2[1] = 9;
		for(int i=0;i<arr1.length; i++) 
			System.out.print(arr1[i] + " ");
		System.out.println("\n-----------------");
		for(int i =0; i<arr2.length;i++)
			System.out.print(arr2[i]+ " ");
		System.out.println("\n-----------------");
		//깊은 복사(deep)
		int[] arr3 = {1, 2, 3};
		int[] arr4 = new int[arr3.length];
		
		for(int i =0; i<arr3.length;i++)
			arr4[i] = arr3[i];
		arr4[1]= 9;
		for(int i =0; i<arr3.length;i++)
			System.out.print(arr3[i]+ " ");
		System.out.println("\n-----------------");
		for(int i =0; i<arr4.length;i++)
			System.out.print(arr4[i]+ " ");
		System.out.println("\n-----------------");
		
		String[] arr5 = {"java", "array", "copy"};
		String[] arr6 = new String[arr5.length];
		
		System.arraycopy(arr5, 0, arr6, 0, arr5.length);
		arr6[1] = "C++";
		for(int i =0; i<arr5.length;i++) 	
			System.out.print(arr5[i] + " ");
		System.out.println();
		for(int i =0; i<arr6.length;i++)
			System.out.print(arr6[i] + " ");
		System.out.println();
		
		String[] arr7 = new String[arr5.length*2];//[null][null][null][null][null][null]
		System.arraycopy(arr5, 1, arr7, 0, arr5.length-1);
		
		for(int i =0; i<arr7.length; i++)
			System.out.print(arr7[i] + " ");
		System.out.println();
		
		String[] arr8 = new String[arr5.length*2];//[null][null][null][null][null][null]
		System.arraycopy(arr5, 0, arr8, 3, arr5.length);
		
		for(int i =0; i<arr8.length;i++)
			System.out.print(arr8[i] + " ");
		System.out.println();
		
	}	
	
}
