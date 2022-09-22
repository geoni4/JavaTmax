package ch06.sec01;

public class PersonMain {
	public static void main(String[] args) {
		Person gildong = new Person();
		Person kkokjung = new Person();
		Person jimae = new Person();
		
		gildong.setName("홍길동");
		kkokjung.setName("임꺽정");
		jimae.setName("일지매");
		
		gildong.setAge(18);
		kkokjung.setAge(-5);
		jimae.setAge(150);
		
		System.out.println(gildong.getName()+"," + gildong.getAge());
		System.out.println(kkokjung.getName()+"," + kkokjung.getAge());
		System.out.println(jimae.getName()+"," + jimae.getAge());
		
		
		
	}
}
