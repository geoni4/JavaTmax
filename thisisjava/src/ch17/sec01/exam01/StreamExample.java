package ch17.sec01.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("신용권");
		set.add("감자바");
		
		//외부반복자
		Iterator<String> itor = set.iterator();
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
		
		//Stream을 이용한 내부 반복 처리
		
		Stream<String> stream = set.stream();
		stream.forEach(name -> System.out.println(name));
//		stream.forEach(new Consumer<T>() {
//			
//		});
	}
}
