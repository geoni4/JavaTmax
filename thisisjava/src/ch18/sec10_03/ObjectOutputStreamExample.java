package ch18.sec10_03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
	public static void main(String[] args) throws IOException {
		//기본 스트림
		FileOutputStream fos = new FileOutputStream("C:\\temp\\object3.dat");
		
		//new 보조스트림(기본 스트림)
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		
		//객체 생성
		Member m1 = new Member("fall", "단풍이");
		
		//객체 직렬화
		oos.writeObject(m1);
		
		oos.flush(); oos.close(); fos.close();
		
		
		
		
	}
}
