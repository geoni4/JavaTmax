package ch14.sec03;

public class A {
	public static void main(String[] args) {
		Thread thread = new Thread(new B());
		thread.setName("mythread");
		System.out.println(thread.getName());
		
		Thread th = null;
		for(int i=0;i<10;i++) {
			th = new Thread();
			th.setName("mythread-" + i);
			System.out.println(th.getName());
		}
	}
}

class C extends Thread{}

//Runnable interface로 구현된 클래스
class B extends A implements Runnable{

	@Override
	public void run() {
		
	}
	
}

