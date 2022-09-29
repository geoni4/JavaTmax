package ch08.verify.exam06;

public class MainExample {
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
	
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
}