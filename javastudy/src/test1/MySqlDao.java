package test1;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {		
		System.out.println("MySql db를 선택"); 
	}

	@Override
	public void insert() {		
		System.out.println("MySql db를 삽입");
	}

	@Override
	public void update() {		
		System.out.println("MySql db를 최신화");
	}

	@Override
	public void delete() {		
		System.out.println("MySql db를 삭제");
	}

}
