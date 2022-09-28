package ch09.sec07.exam03;

import ch09.sec07.exam03.Button.ClickListener;;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		Button.ClickClass bc = btn.new ClickClass();
		
		btn.setClickListener(bc);
		btn.click();
		
		btn.setClickListener(btn.new ClickClass());
		btn.click();
		
		//익명 객체 anonymous
		btn.setClickListener(new ClickListener() {
			@Override
			public void onClick() {
				System.out.println("클릭");
			}
		});
		//위의 익명 객체와 같은 형태
		
		//람다식
		ClickListener cl = new ClickListener() {
			@Override
			public void onClick() {
				System.out.println("칼릭");
			}
		};
		btn.setClickListener(cl);
		btn.click();
		
		//람다식
		ClickListener cl2 = () -> {
			System.out.println("칼릭");
		};
		btn.setClickListener(cl);
		btn.click();

	}
}
