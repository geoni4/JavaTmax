package ch05.sec12;

import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {
		Week today = null;
		
		//달력 정보 저장한 객체 Calendar. 생성 시는 new Calendar()로 생성 불가
		// Calendar.getInstance()로 생성 - 싱글톤 방식
		
		Calendar cal =Calendar.getInstance();
		
		int week = 3;
		
		switch(week) {
		case 1: today = today.SUNDAY; break;
		case 2: today = today.MONDAY; break;
		case 3: today = today.TUESDAY; break;
		case 4: today = today.WEDNESDAY; break;
		case 5: today = today.THURSDAY; break;
		case 6: today = today.FRIDAY; break;
		case 7: today = today.SATURDAY; break;
		}
		
		System.out.println(today.toString());
		
		if(today == Week.SUNDAY) {
			System.out.println("축구를 합니다.");
		} else {
			System.out.println("공부를 합니다.");
		}
		System.out.println();
		
	}
}
