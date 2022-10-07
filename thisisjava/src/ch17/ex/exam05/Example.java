package ch17.ex.exam05;

import java.util.Arrays;
import java.util.List;

public class Example {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
			"This is a java book",
			"Lambda Expressions",
			"Java8 support lambda expressions"
		);
		list.stream()
			.filter(str -> str.toLowerCase().contains("java"))
			.forEach(str -> System.out.println(str));
	}
}
