package test1;

public class Exam03 {

	public static void main(String[] args) {
		//A class에 10명의 학생의 성적이 아래와 같다면 평균값은?
		int[] scores = {70,60,55,75,95,90,80,80,85,100};
		double avg1 , avg2;
		int sum1=0 , sum2=0;
		int i; //초기값, 변수선언
		
		//for
		for(i=0;i<scores.length;i++) {
			sum1+=scores[i];
		}
		avg1 = (double)sum1/scores.length;
		System.out.printf("%f", avg1);
		//향상된 for
		for(int el:scores) {
			sum2+=el;
		}
		avg2=(double)sum2/scores.length;
		System.out.printf("%f", avg2);
	}

}
