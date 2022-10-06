package ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		
		//객체 저장
		
		treeSet.add(new Person(45, "홍길동"));
		treeSet.add(new Person(25, "감자바"));
		treeSet.add(new Person(31, "박지원"));
		
		//객체 하나씩 가져와서 출력
		for(Person person: treeSet) {
			System.out.println(person);
		}
		
	}
}
