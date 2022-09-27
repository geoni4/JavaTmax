package ch07.sec11;

//부모 클래스에서 상속 가능한 자식 클래스 관리
public sealed class Person permits Employee, Manager {

	public String name;
	public void work() {
		System.out.println("하는 일이 결정되지 않았습니다.");
	}
}
