package ch07.sec10.exam02;


//abstract로 선언된 클래스 = 추상 클래스
public abstract class Animal {
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public static void main(String[] args) {
		//Animal animal = new Animal();
	}
}

class Bird extends Animal{}
class Cat extends Animal{}
