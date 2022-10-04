package ch14.sec08;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread ast = new AutoSaveThread();
		
		//데몬 스레드로 지정
		ast.setDaemon(true);
		System.out.println(ast.isDaemon());
		ast.start();
		
		try {
			Thread.sleep(3000);
		} catch(Exception e) {
			
		}
		System.out.println("메인 쓰레드 종료.");
	}
}
