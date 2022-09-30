package ch12.sec08;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarExample {
	public static void main(String[] args) {
		TimeZone tz = TimeZone.getTimeZone("Asia/Seoul");
		Calendar now = Calendar.getInstance(tz);
		
		
		
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1);
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		
		System.out.println(now.get(Calendar.DAY_OF_WEEK));	//요일이 숫자로 나온다.
		
		System.out.println( Calendar.AM_PM == Calendar.AM ? "오전" : "오후");
		System.out.println( now.get(Calendar.HOUR));
		System.out.println( now.get(Calendar.MINUTE));
		
		System.out.println(Calendar.AM);
		System.out.println(Calendar.PM);
		//System.out.println(now.get(Calendar.AM_PM));
	}
}
