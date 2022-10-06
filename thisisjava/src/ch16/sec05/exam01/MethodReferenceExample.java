package ch16.sec05.exam01;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.action((x, y) -> Computer.staticMethod(x, y));
		
		//메소드 참조
		person.action( Computer :: staticMethod );
		
		Computer com = new Computer();
		
		person.action( com :: instanceMethod);
	}
}
