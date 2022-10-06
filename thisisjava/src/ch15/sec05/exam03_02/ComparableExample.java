package ch15.sec05.exam03_02;

import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		
		//객체 저장
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("감자바", 25));
		treeSet.add(new Person("박지원", 31));
		
		//객체 하나씩 가져와서 출력
		for(Person person: treeSet) {
			System.out.println(person.name + ": " + person.age);
		}
		
	}
}
