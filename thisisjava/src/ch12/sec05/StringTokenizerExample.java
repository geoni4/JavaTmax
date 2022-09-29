package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String data1 = "홍길동&이수홍,박연수";
		String[] arr = data1.split("&|,");// | or
		for(String token: arr) {
			System.out.println(token);
		}
		System.out.println("------------");
		StringTokenizer st = new StringTokenizer("홍길동/이수홍/박연수", "/");
		System.out.println(st);
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		
	}
}
