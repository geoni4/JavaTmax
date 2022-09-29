package ch11.sec04;

import java.util.Scanner;

public class TryWithResourcesExample2 {
	public static void main(String[] args) {
		//AutoClosable 인터페이스로 구현된 객체만 이렇게 사용 가능
		//try-with-resources
		try(Scanner scanner = new Scanner(System.in);) {
			
			String msg = scanner.nextLine();
			System.out.println(msg);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
