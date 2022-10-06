package ch18.sec04.exam02;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("C:\\Temp\\test1.db");
			while(true) {
				int data = reader.read();	//char읽은 문자를 int로 저장
				if(data == -1) break;
				System.out.print((char)data);
			}
			reader.close();
			System.out.println();
			System.out.println("----------------");
			
			
			//버퍼
			reader = new FileReader("C:\\Temp\\test1.db");
			char[] charArr = new char[100];
			while(true) {
				int num = reader.read(charArr);//읽은 문자 데이터는 charArr에 저장되고,
												// 저장된 개수는 num에 리턴됨.
				if(num == -1) break; 	// EOF면 -1
				for(int i =0; i<num ; i++) {
					System.out.print(charArr[i]);
				}
			}
			reader.close();
		} catch(Exception e) {
			
		}
	}
}
