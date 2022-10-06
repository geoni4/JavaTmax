package ch17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ParallelStreamExample {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("람다식");
		list.add("박병렬");
		
		// 내부반복자
		Stream<String> parallelStream =list.parallelStream();
//		parallelStream.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String t) {
//				System.out.println(t+":"+Thread.currentThread().getName());
//			}
//		});
//		parallelStream.forEach(name -> System.out.println(name));
		parallelStream.forEach(System.out :: println);
		
	}
}
