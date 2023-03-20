package study06;

public class Professor {
	//Professor(){}
	
	private String pName;
	String pMajor;
	int pLevel;
	
	void check() {
		System.out.println("출석부르기");
	}
	void homework() {
		System.out.println("과제내주기");
	}
	void giveScore() {
		System.out.println("학점주기");
	}
	
	public void setPName() {
		this.pName=pName;
	}
	public String getPName() {
		return pName;
	}
}
