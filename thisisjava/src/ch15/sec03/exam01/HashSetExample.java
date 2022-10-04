package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("Java");
		set.add("JDBC");
		set.add("Servelet/JSP");
		set.add("Java");
		set.add("myBatis");
		
		System.out.println(set.size());
		
		System.out.println(set);
		
		
	}
}
