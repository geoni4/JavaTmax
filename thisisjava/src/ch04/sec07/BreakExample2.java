package ch04.sec07;

//두 개의 주사위를 던져 두 눈의 합이 6이 될 때 반복문을 빠져나가도록 수정하시오.
//x + y = 6 (1 <= x <= 6, 1 <= x <= 7), (1, 5), (2, 4), (3, 3), (4, 2), (5, 1)
public class BreakExample2 {
	public static void main(String[] args) {
		while(true) {
			int num1 = (int)(Math.random() * 6) + 1;
			int num2 = (int)(Math.random() * 6) + 1;
			System.out.printf("(%d, %d)\n", num1, num2);
			if(num1 + num2 == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
