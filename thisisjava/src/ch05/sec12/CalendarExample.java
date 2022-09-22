package ch05.sec12;

import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DATE);
		int day1 = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		int today = cal.get(Calendar.DAY_OF_YEAR);
		
		//System.out.println(new Date().getTime());
		
		System.out.printf("%d년 %d월 %d일 %d요일 %d시 %d분 %d초\n",
				year, month, day, week, hour, minute, second);
		
		System.out.println("오늘은 올해의 " + today + "번째 날입니다.");
	}
}
