package ch14.sec03.exam02;


//Runnable 인터페이스를 구현
public class MyThread implements Runnable {

	@Override
	public void run() {
		for(int i =0 ;i <5;i++) {
			System.out.println("비프");
			try {
				Thread.sleep(500);;
				
			} catch(Exception e) {
		
			}
		}
	}
	
}
