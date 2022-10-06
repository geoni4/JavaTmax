package ch15.sec05.exam03_02;

public class Person implements Comparable<Person>{
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);
		//앞이면 -1, 같으면 0, 뒤면 1 return
	}
	
	
}
