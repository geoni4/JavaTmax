package ch05.sec03;

public class ReferenceVariableCompareExample {
	public static void main(String[] args) {
		//타입[] 변수; <- 해당 타입 배열
		int[] arr1; // int 타입의 값만 저장하는 1차월 배열 선언(stack)
		int[] arr2; // stack
		
		// 배열 객체 생성
		// new 타입[저장길이]
		arr1 = new int[3]; // 길이가 3인(int타입의 값 3개를 저장할 수 있는 공간) 배열 객체 생성
		// [1][2][3]
		arr1[0] =1; arr1[1] = 2; arr1[2] = 3;
		
		//초기값으로 배열 객체 만들기
		arr2 = new int[] {1, 2, 3};
		
		//초기값으로 배열 생성(배열 선언과 동시에 생성)
		int[] arr3 = new int[] {1, 2, 3};
		
		int[] arr4 = arr3;
		System.out.println(arr1==arr2);
		System.out.println(arr3==arr4);
		System.out.println(arr2!=arr3);
		
		int addressArr1 = System.identityHashCode(arr1);
		int addressArr2 = System.identityHashCode(arr2);
		int addressArr3 = System.identityHashCode(arr3);
		int addressArr4 = System.identityHashCode(arr4);
		System.out.println(addressArr1);
		System.out.println(addressArr2);
		System.out.println(addressArr3);
		System.out.println(addressArr4);
		
	}
}
