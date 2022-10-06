package ch18.sec10_03;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\temp\\object3.dat"); 
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//객체 복원
		Member m1 = (Member)ois.readObject();
		
		ois.close(); fis.close();
		System.out.println(m1);
		
		
	}
	
	
}
