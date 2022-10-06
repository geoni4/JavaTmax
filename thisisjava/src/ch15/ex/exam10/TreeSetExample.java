package ch15.ex.exam10;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<Student>();
		treeSet.add(new Student("blue", 96));
		treeSet.add(new Student("hong", 86));
		treeSet.add(new Student("blue", 92));
		Student student = treeSet.last();
		System.out.println("최고 점수: " + student.score);
		System.out.println("최고 점수를 받은 아이디: " + student.id);
	}
}
class Student implements Comparable<Student>{
	public String id;
	public int score;
	public Student(String id, int score) {
		this.id = id;
		this.score = score;
	}
	

	@Override
	public int compareTo(Student o) {
		return score - o.score;
	}
}