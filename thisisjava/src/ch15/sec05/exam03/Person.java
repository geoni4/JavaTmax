package ch15.sec05.exam03;

public class Person implements Comparable<Person>{
	public int sno;
	public String name;
	
	public Person(int sno,String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {
		return sno - o.sno;
		//앞이면 -1, 같으면 0, 뒤면 1 return
	}

	@Override
	public String toString() {
		return "Person [sno=" + sno + ", name=" + name + "]";
	}
	
	
}
