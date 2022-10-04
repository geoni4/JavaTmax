package ch14.sec09.exam01;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ExecutorServiceExample {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(5);
		
		//작업
		//쓰레드풀 종료
		
		es.shutdown();
	}
}
