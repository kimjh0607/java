package test1;

public class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("oracle db를 선택"); 
	}

	@Override
	public void insert() {
		System.out.println("oracle db를 삽입"); 
	}

	@Override
	public void update() {
		System.out.println("oracle db를 최신화"); 
	}

	@Override
	public void delete() {
		System.out.println("oracle db를 삭제"); 
	}

}
