package test2;

public class Student {
	private final String name; //이름
	private final boolean isMale; //성별
	private final int grade; //학년
	private final int ban; //반
	private final int score; //점수
	
	public Student(String name, boolean isMale, int grade, int ban, int score) {
		super();
		this.name = name;
		this.isMale = isMale;
		this.grade = grade;
		this.ban = ban;
		this.score = score;
	}
	
	//toString
	@Override
	public String toString() {
		return String.format("[%s,%s,%d학년 %d반, %3d점",name,isMale?"남":"여",grade,ban,score);
	}
		
	
	//getter setter
	public String getName() {
		return name;
	}

	public boolean getIsMale() {
		return isMale;
	}

	public int getGrade() {
		return grade;
	}

	public int getBan() {
		return ban;
	}

	public int getScore() {
		return score;
	}
	
	
	
}
