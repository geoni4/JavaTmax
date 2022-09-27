package ch07.sec10.exam03;


//abstract로 선언된 클래스 = 추상 클래스
public abstract class Animal {
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound();
	
	public static void main(String[] args) {
		//추상 클래스이므로 객체 생성 불가
		//Animal animal = new Animal();
		//추상 클래스는 타입 선언용
		
		Animal animal;
		animal = new Bird();	//추상 클래스의 메소드 사용을 위해서는 자식 객체(실체 클래스)를 생성해서 대입.
		animal.breathe();
		animal.sound();
		animal = new Cat();
		animal.sound();
	}
	
	
	
}


class Bird extends Animal{
	@Override
	public void sound() {
		System.out.println("짹짹");
	}
}
class Cat extends Animal{
	@Override
	public void sound() {
		System.out.println("미욤");
	}
}
