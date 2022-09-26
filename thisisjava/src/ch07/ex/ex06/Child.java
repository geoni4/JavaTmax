package ch07.ex.ex06;

public class Child extends Parent{
	public int studentNo;
	
	public Child(String name, int studentNo){
		super(name);
		this.studentNo = studentNo;
	}
}