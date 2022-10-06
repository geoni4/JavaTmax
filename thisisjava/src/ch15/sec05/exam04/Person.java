package ch15.sec05.exam04;

public class Person{
	public int sno;
	public String name;
	
	public Person(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [sno=" + sno + ", name=" + name + "]";
	}

	
	
}
