package ch18.sec07.exam01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
	public static void main(String[] args) throws Exception {
		String originalFilePath1 = CopyExample.class
				.getResource("originalFile1.jpg").getPath();
		
		//System.out.println(originalFilePath1);
		
		String targetFilePath = "C:/temp/targetFile1.jpg";
		
		//버퍼 없음
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath);
		
		long noBufferTime = copy(fis, fos);
		System.out.println("버퍼 미사용 시:\t" + noBufferTime + "(ns)");
		
		
	}
	public static long copy(InputStream is, OutputStream os) throws Exception {
		
		//시작 시간
		long startTime = System.nanoTime();
		
		//while문 = 복사작업
		while(true) {
			int data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		
		//종료 시간
		long endTime = System.nanoTime();
		
		return endTime - startTime;
		
	}
}
