package ch13.sec01;

public class GenericExample {
	public static void main(String[] args) {
		//제네릭 적용 후
		Box box1 = new Box();
		box1.content = "안녕하세요";
		String str = (String)box1.content;	//Object -> String 캐스팅
		System.out.println(str);
		box1.content = 100;
		int intValue = (Integer)box1.content;//Object -> Integer 캐스팅
		System.out.println(intValue);
		
		Box box2 = new Box();
		box2.content = 100;
		int value = (Integer)box2.content;	//Object -> Integer 캐스팅
		System.out.println(value);
		
		//Generic 적용 후, 타입 체킹
		//<> 안에는 참조 타입만 와야한다.
		//int boolean 등을 받고 싶으면 <Integer><Boolean> 사용하면 됨
		Box<String> box3 = new Box<String>();
		box3.content = "안녕하세요";
		String str2 = box3.content;
		System.out.println(str2);
		
		Box<Integer> box4 = new Box<Integer>();
		box4.content = 100;
		int value2 = box4.content;
		System.out.println(value2);
		
		
	}
}
