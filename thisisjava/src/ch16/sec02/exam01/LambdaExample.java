package ch16.sec02.exam01;

public class LambdaExample {
	public static void main(String[] args) {
		
		Person person = new Person();
		
		//매개 변수가 없는 메소드
		//익명 개체 만들어서 전달
		person.action(new Workable() {
			@Override
			public void work() {
				System.out.println("일을 합니다.");
			}
		});
		
		
		//람다식
		person.action(() ->{
			System.out.println("출근을 합니다.");
			System.out.println("프로그래밍을 합니다.");
		});
	}
}
