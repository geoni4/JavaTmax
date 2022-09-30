package ch12.sec12;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		for(Method method:declaredMethods) {
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
			printLine(printAnnotation);
		}
//		service.method1();
//		service.method2();
//		service.method3();
	}
	
	public static void printLine(PrintAnnotation printAnnotation) {
		if(printAnnotation !=null) {
			int number = printAnnotation.number();
			for (int i =0; i<number; i++) {
				String value = printAnnotation.value();
				System.out.print(value);
			}
			System.out.println();
		}
		
	}
}
