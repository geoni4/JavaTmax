package ch14.sec03.exam02;



public class BeepPrintExample {
	public static void main(String[] args) {
		//쓰레드 생성
		Thread thread = new Thread(() -> {
			for(int i =0 ;i <5;i++) {
				System.out.println("비프");
				try {
					Thread.sleep(500);
					
				} catch(Exception e) {
			
				}
			}
		});
		thread.start();
		
		for(int i =0 ;i <5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
		}
	}
}
