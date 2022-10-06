package ch17.sec07.exam02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import ch17.sec03.Student;

public class SortingExample {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", 30));
		list.add(new Student("신용권", 10));
		list.add(new Student("유미선", 20));
		
		//점수 기준 오름차순
		list.stream()
			.sorted(( o1, o2) -> o1.getScore()-o2.getScore())
			.forEach(s -> System.out.println(s.getName() +": " + s.getScore()));
		
		System.out.println("----------------------------");
		//점수 내림차순
		list.stream()
			.sorted(( o1, o2) -> o2.getScore()-o1.getScore())
			.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
	}
}
