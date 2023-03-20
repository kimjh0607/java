package test1;

public class Average {

	int math;
	int korean;
	int english;
	int average;
	
	public static void main(String[] args) {
		Average avg = new Average();
		avg.math = 55;
		avg.korean = 80;
		avg.english = 75;
		avg.average = (avg.math+avg.korean+avg.english)/3;
		System.out.println("세과목 평균: "+avg.average);
	 
		

	}

}
