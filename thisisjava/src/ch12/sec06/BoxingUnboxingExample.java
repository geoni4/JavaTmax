package ch12.sec06;

public class BoxingUnboxingExample {
	public static void main(String[] args) {
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());		// Unboxing
		System.out.println(obj.getClass().getTypeName());	//
		int value = obj;		// Auto unboxing
		obj = Integer.valueOf(value); //Boxing
		System.out.println("value: " + value); 
		System.out.println("value: " + obj);	
	}
}
