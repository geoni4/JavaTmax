package ch14.sec06.exam02;

public class ThreadPriorityExample {
	public static void main(String[] args) {
		for(int i =1; i<=10;i++) {
			Thread thread = new Thread("thread-" + i);
			System.out.println(thread.getName());
			System.out.println(thread.getPriority());
//			if(thread.getPriority())
		}
	}
}
