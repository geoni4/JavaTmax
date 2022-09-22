package ch06.sec01;

//접근 제한자 class 클래스명{} - 설계도
public class Person {
	//속성
	private String name;
	private int age;
	
	
	//동작
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<0) age = 0;
		else if(age>120) age = 120;
		this.age = age;
	}

	void eat(String food) {
		System.out.println(food +"를 먹다");
	}
	void laugh() {
		System.out.println("웃다");
	}
	
}
