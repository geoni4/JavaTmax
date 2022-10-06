package ch18.sec02.exam02;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("c:\\Temp\\test1.db");
			while(true) {
				int data = is.read();
				if(data == -1 ) break; // EOF의 값 -1
				System.out.println(data);
			}
		} catch (Exception e) {
			
		}
	}
}
