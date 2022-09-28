package ch07.sec07.exam08.ex01;

public class MainExample {
	public static void main(String[] args) {
		Animal animal;
		Bird bird = new Bird();
		Dog dog = new Dog();
		Fish fish = new Fish();
		
		animal = bird;	// bird 객체가 Animal 타입으로 변환
		animal = dog;	// dog 객체가 Animal 타입으로 변환
		animal = fish;	// fish 객체가 Animal 타입으로 변환
		animal.say();
	}
}
