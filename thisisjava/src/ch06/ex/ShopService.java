package ch06.ex;

public class ShopService{
	//1. 클래스 자신 타입의 private static 필드 선언
	private static ShopService instance = new ShopService();
	
	//2. private 생성자 선언
	private ShopService(){}
	
	//3. getInstance method 선언
	public static ShopService getInstance(){
		return instance;
	}
}
