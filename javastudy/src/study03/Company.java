package study03;
//singleton
public class Company {
	private static Company instance = new Company();
	
	private Company() {
		System.out.println("company 생성자 객체 생성");
	}
	
	public static Company getInstance(){//static 객체생성없이도
		if(instance == null) { 
			instance = new Company();
		}
		return instance;
	}	
}
