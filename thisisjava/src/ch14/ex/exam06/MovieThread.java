package ch14.ex.exam06;

public class MovieThread extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("동영상을 재생합니다.");
			if(true)break;
		}
	}
	
}
