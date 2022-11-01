package ch15.ex.exam07;

import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board: list) {
			System.out.println(board.getTitle() + "- " + board.getContent());
		}
	}
}

class Board{
	private String title;
	private String content;
	
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}
	
	
	
}

class BoardDao{
	private List<Board> list; 
	public List<Board> getBoardList(){
		return list;
	}
}