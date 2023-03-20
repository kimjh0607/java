package test1;

public class Exam1 {

	public static void main(String[] args) {
		//1-100까지 정수 중에서 3의 배수의 총합을 구하시오.
		int sum = 0;
		int i;
		
		for (i=0;i<=100;i++) {
			if(i%3==0) {
				sum=sum+i;				
			}
		}
			System.out.printf("3의 배수의 총합 : "+sum);
		

	}
}
