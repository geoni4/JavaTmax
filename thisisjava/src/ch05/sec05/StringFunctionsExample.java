package ch05.sec05;

public class StringFunctionsExample {
	public static void main(String[] args) {
		String ssn = "950624-1230123";
		
		System.out.println("ssn에서 -의 위치는 "+ssn.indexOf('-'));
		System.out.println("ssn에서 생년월일은 " + ssn.substring(0, ssn.indexOf('-')));
		int index = ssn.indexOf("-") + 1;
		System.out.println("ssn에서 성별은 " + (ssn.substring(index, index+1).equals("1") ? "남자" : (ssn.substring(index, index+1).equals("2") ? "여자": "기타")));
		
		System.out.println("ssn에서 생년월일 부분과 뒷부분으로 분리");
		String[] tokens = ssn.split("-");
		System.out.println("앞부분: " + tokens[0]);
		System.out.println("뒷부분: " + tokens[1]);
		
		//indexOf(패턴)의 결과값이 -1이면 해당 패턴이 없는 것.
		System.out.println("ssn에서 7이 있는지 여부 확인: " + (ssn.indexOf("7")!=-1?"7이 포함":"7이 미포함"));
		
		//ssn의 전체 길이 확인
		System.out.println("전체 길이: " + ssn.length());
		
		//ssn의 첫번째 문자 확인
		System.out.println("첫번째 문자: " + ssn.charAt(0));
		
		//문자열 변환
		ssn = ssn.replace("-", "*");
		System.out.println("ssn의 -를 *로 바꾸기: " + ssn);
		
		//
		System.out.println("ssn의 뒷부분을 *로 바꾸기: ");
		String second = ssn.substring(ssn.indexOf("*")+1);
		System.out.println(second.length());
		String first = ssn.substring(0, ssn.indexOf("*"));
		for(int i = 0;i<second.length();i++) {
			first += '*';
		}
		System.out.println(first);
	}
}
