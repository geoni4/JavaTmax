package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Java");
		set.add("JDBC");
		set.add("Servelet/JSP");
		set.add("Java");
		set.add("myBatis");
		
		System.out.println(set.size());
		
		System.out.println(set);
		
		//반복자 생성 iterator() <- index가 없기 때문에 접근할 수 없음. 반복자로 접근하는 것이 편리하다.
		Iterator<String> itor = set.iterator();
		while(itor.hasNext()) {
			System.out.println( itor.next());
		}
		
		System.out.println( set.contains("myBatis")?"있음":"없음");
		
		//향상된 for문은 iterator를 사용한 것과 같다.
		for(String str:set) {
			System.out.println(str);
		}
		
		
	}
}
