package ch18.sec11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception{
		//File 객체 생성
		File dir = new File("c:/tmp/images");
		File file1 = new File("c:/tmp/file1.txt");
		File file2 = new File("c:/tmp/file2.txt");
		File file3 = new File("c:/tmp/file3.txt");
		
		
		

		if (!dir.exists()) dir.mkdirs();
		if(!file1.exists()) file1.createNewFile();
		if(!file2.exists()) file2.createNewFile();
		if(!file3.exists()) file3.createNewFile();
		
		//tmp 폴더의 내용 출력
		File temp = new File("c:/tmp");
		File[] contents = temp.listFiles();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
		
		for(File file: contents) {
			System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.printf("%-10s%-20s", "<DIR>" , file.getName());
			} else {
				System.out.printf("%-10s%-20s", file.length(), file.getName());
			}
			System.out.println();
		}
		
		
	}
}
