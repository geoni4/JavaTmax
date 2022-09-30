package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperartionExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(dtf.format(now));
		
		LocalDateTime result1 = now.plusYears(1);
		System.out.println(dtf.format(result1));
		
		LocalDateTime result2 = now.plusMonths(1);
		System.out.println(dtf.format(result2));
		
		LocalDateTime result3 = now.plusDays(7);
		System.out.println(dtf.format(result3));
		
		
	}
}
