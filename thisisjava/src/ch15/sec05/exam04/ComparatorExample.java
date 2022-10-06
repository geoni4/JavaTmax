package ch15.sec05.exam04;

import java.util.Objects;
import java.util.TreeSet;

public class ComparatorExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<> (new PersonComparator());
		
		treeSet.add(new Person(5, "감자바"));
		treeSet.add(new Person(25, "홍길동"));
		treeSet.add(new Person(31, "박지원"));
		
		for(Person person:treeSet) {
			System.out.println(person);
		}
		
	}
}
