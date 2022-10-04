package ch14.sec05.exam02;

public class YieldExample {
	public static void main(String[] args) {
		WorkThread workThreadA = new WorkThread("workThreadA");
		WorkThread workThreadB = new WorkThread("workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		try {
			Thread.sleep(3000);
			
		} catch(Exception e) {
			
		}
		workThreadA.work = false;
		
		try {
			Thread.sleep(5000);

		} catch(Exception e) {
			
		}
		workThreadA.work = true;
	}
}


class WorkThread extends Thread{
	
	//flag 용 field
	public boolean work = true;

	public WorkThread(boolean work) {
		this.work = work;
	}

	public WorkThread(String name) {
		setName(name);
	}

	@Override
	public void run() {
		while(true) {
			if(work) {	// 현재 쓰레드가 작업 중이면 
				System.out.println(getName() + ": 작업처리"); // 이름 출력
			} else {	// 작업 중이 아니면
				Thread.yield();	// 대기열로 이동
			}
		}
	}
	
	
}