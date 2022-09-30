package ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println(date);
		System.out.println(new Date());
		System.out.println(new Date().toString());
		
		
		//날짜 포맷
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초(E요일)");
		String strNow = sdf.format(date);
		System.out.println(strNow);
		
	}
}
