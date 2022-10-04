package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetExample3 {
	public static void main(String[] args) {
		Set<Board> set = new HashSet<>();
		
		set.add(new Board(1,"제목1", "내용1", "글쓴이1"));
		set.add(new Board(2, "제목2", "내용2", "글쓴이2"));
		set.add(new Board(3,"제목3", "내용3", "글쓴이3"));
		set.add(new Board(4,"제목4", "내용4", "글쓴이4"));
		set.add(new Board(5,"제목5", "내용5", "글쓴이5"));
		
		System.out.println(set.size());
		
		System.out.println(set);
		
		set.add(new Board(1,"제목1", "내용1", "글쓴이1"));
		
		//반복자 생성 iterator() <- index가 없기 때문에 접근할 수 없음. 반복자로 접근하는 것이 편리하다.
		Iterator<Board> itor = set.iterator();
		while(itor.hasNext()) {
			System.out.println( itor.next());
		}
		
		System.out.println( set.contains(new Board(1, "제목1", "내용1", "글쓴이1"))?"있음":"없음");
		
		//향상된 for문은 iterator를 사용한 것과 같다.
		for(Board str:set) {
			System.out.println(str);
		}
		
		
	}
}
