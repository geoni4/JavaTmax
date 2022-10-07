package ch18.ex.exam10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example {
	public static void main(String[] args) {
		String readFilePath = "D:/temp/dir1/photo1.jpg";
		String writeDirPath = "D:/temp/dir2";
		String writeFilePath = "D:/temp/dir2/photo2.jpg";
		File dir = new File(writeDirPath);
		try {
			System.out.println("원본 파일 경로: " + readFilePath);
			System.out.println("복사 파일 경로: " + writeFilePath);
			if(!dir.exists()) dir.mkdirs();
			
			FileInputStream fis = new FileInputStream(readFilePath);
			BufferedInputStream bis = new BufferedInputStream(fis);

			FileOutputStream fos = new FileOutputStream(writeFilePath);
			BufferedOutputStream bos = new BufferedOutputStream(fos);


			byte[] data = new byte[1024];

			
			while (true) {
				int num = bis.read(data);
				if (num == -1)
					break;
				bos.write(data, 0, num);
			}

			
			bos.flush(); fos.flush();
			bos.close(); fos.close();
			bis.close(); fis.close();
			
			System.out.println("복사가 성공되었습니다.");
			
		} catch(FileNotFoundException e) {
			System.out.println("원본 파일이 존재하지 않습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
