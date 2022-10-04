package ch15.sec02.exam01;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();	//vector는 동기화 List구현체
		
		
		//(Board) 객체 저장
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		//저장된 객체 수
		System.out.println(list.size());
		
		//특정 인덱스의 객체 얻기
		Board board = list.get(0);
		System.out.println(board);
		
		
		list.set(0, new Board("제목_new1", "내용_new1", "글쓴이_new1"));
		board = list.get(0);
		System.out.println(board);
		System.out.println(list.size());
		list.add(1, new Board("제목_new2", "내용_new2", "글쓴이_new2"));
		// 인덱스 번호로 삭제
		board = list.remove(0);
		System.out.println(board);
		for(Board b: list)
			System.out.println(b);
		
		System.out.println("--------------");
		
		
		// 객체로 삭제 remove(객체) <- equivalent 해야 함.(hashCode(), equals() 메소드를 재정의해서)
		boolean isRemoved = list.remove(new Board ("제목2", "내용2", "글쓴이2"));
		
		System.out.println(isRemoved?"객체가 삭제 됨":"아무 동작도 하지 않았음");
		System.out.println("--------------");
		for(Board b: list)
			System.out.println(b);
		
		// 모든 객체 삭제
		list.clear();
		
		// list가 비어있는지 확인 isEmpty();
		System.out.println(list.isEmpty()?"리스트가 비어 있음": "아직 객체가 남아 있음");
		
	}
}
