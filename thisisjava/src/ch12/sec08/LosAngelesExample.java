package ch12.sec08;


import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class LosAngelesExample {
	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar now = Calendar.getInstance(timeZone);
		
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1);
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		
		System.out.println(now.get(Calendar.DAY_OF_WEEK));	//요일이 숫자로 나온다.
		
		System.out.println( now.get(Calendar.AM_PM) == 0 ? "오전" : "오후");
		System.out.println( now.get(Calendar.HOUR));
		System.out.println( now.get(Calendar.MINUTE));
		System.out.println(now.get(Calendar.PM));
	}
}
