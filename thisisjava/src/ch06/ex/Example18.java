package ch06.ex;

public class Example18 {
	public static void main(String[] args) {
		//싱글톤
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();

		if(obj1 == obj2){
			System.out.println("같은 ShopService 객체입니다.");
		} else {
			System.out.println("다른 ShopService 객체입니다.");
		}
	}
}