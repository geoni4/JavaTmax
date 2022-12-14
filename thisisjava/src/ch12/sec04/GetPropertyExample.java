package ch12.sec04;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
	public static void main(String[] args) {
		//운영체제와 사용자 정보 출력
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));
		
		//전체 키와 값 출력
		Properties props = System.getProperties();
		
		//System.out.println(props);
		Set keys = props.keySet();
		
		
		//Set 컬렉션 중복을 배제한 객체 저장
		//iterable한 객체(반복자가 있는 객체)
		for(Object key:keys) {
			System.out.println((String)key+": " + System.getProperty((String)key));
		}
	}
}
