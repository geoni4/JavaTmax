package ch08.verify.exam07;

public interface DataAccessObject {
	public void select();
	public void insert();
	public void update();
	public void delete();
}

class OracleDao implements DataAccessObject{
	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}
	@Override
	public void insert() {
		System.out.println("Oracle DB에 삽입");
	}
	@Override
	public void update() {
		System.out.println("Oracle DB를 수정");
	}
	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
	}
}

class MySql implements DataAccessObject{
	@Override
	public void select() {
		System.out.println("MySql DB에서 검색");
	}
	@Override
	public void insert() {
		System.out.println("MySql DB에 삽입");
	}
	@Override
	public void update() {
		System.out.println("MySql DB를 수정");
	}
	@Override
	public void delete() {
		System.out.println("MySql DB에서 삭제");
	}
}
