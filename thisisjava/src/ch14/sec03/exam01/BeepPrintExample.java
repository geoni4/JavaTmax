package ch14.sec03.exam01;

//import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
		//쓰레드 
//		Toolkit
		for(int i =0 ;i <5;i++) {

			System.out.println("비프");
			try {
				Thread.sleep(500);;
				
			} catch(Exception e) {
				
			}
		}
		for(int i =0; i<5;i++) {
			
		}
	}
}
