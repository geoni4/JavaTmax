package ch18.ex.exam07;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example {
	public static void main(String[] args) throws Exception{
		String filePath = "E:/javaWorkspace/thisisjava/src/ch02/VariableUseExample.java";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int rowNumber = 0;
		String rowData;
		
		while(true) {
			rowNumber++;
			rowData = br.readLine();
			if(rowData == null) break;
			System.out.println(rowNumber + ": " + rowData);
		}
		
		br.close(); fr.close();
		
	}
}
