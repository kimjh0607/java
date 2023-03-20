package test1;

public class Exam06 {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
		
	}
}
	

//DataAccessObject dao1 = new OracleDao();
//dao1.select();
//dao1.insert();
//dao1.select();
//dao1.insert();
//dbwork메서드구현으로