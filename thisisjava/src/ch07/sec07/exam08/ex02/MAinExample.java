package ch07.sec07.exam08.ex02;

public class MAinExample {
	public static void main(String[] args) {
		Animal animal;	//Animal 영역
		Bird bird = new Bird();	//Animal 영역 + Bird 영역
		Dog dog = new Dog();	//Animal 영역 + Dog 영역
		Fish fish = new Fish();	//Animal 영역 + Fish 영역
		
		animal = bird;	// bird 객체가 Animal 타입으로 변환
		animal.say();	// Bird 객체의 say()
		animal = dog;	// dog 객체가 Animal 타입으로 변환
		animal.say();	// Dog 객체의 say()
		animal = fish;	// fish 객체가 Animal 타입으로 변환
		animal.say();	// Fish 객체의 say()
	}
}
