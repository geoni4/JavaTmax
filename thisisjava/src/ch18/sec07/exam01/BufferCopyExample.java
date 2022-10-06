package ch18.sec07.exam01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferCopyExample {
	public static void main(String[] args) throws Exception {
		String originalFilePath1 = BufferCopyExample.class
				.getResource("originalFile2.jpg").getPath();
		
		//System.out.println(originalFilePath1);
		
		String targetFilePath = "C:/temp/targetFile2.jpg";
		
		//버퍼 없음
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath);
		
		//보조 스트림
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
//		long noBufferTime = copy(fis, fos);
//		System.out.println("버퍼 미사용 시:\t" + noBufferTime + "(ns)");
		
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼 사용 시:\t" + bufferTime + "(ns)");
		
		bis.close(); bos.close();
//		fis.close(); fos.close();
		
		
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
