package ch12.sec10;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "02-123-4567";
		
		boolean result = Pattern.matches(regExp, data);
		System.out.println(result ? "정규식과 일치" : "불일치");
		
		regExp ="\\w+@\\w+(\\.\\w+){1,2}";	// \w = word, + = 한개 이상
		
		data = "tatelulove4@naver.com";
		
		data = "angel@mycompany.com";
		
		result = Pattern.matches(regExp, data);
		System.out.println(result ? "정규식과 일치" : "불일치");
	}
}
