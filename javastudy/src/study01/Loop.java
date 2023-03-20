package study01;

public class Loop {

	public static void main(String[] args) {
		int num = 1; //초기화
		int sum = 0; //합계
		
		while(num <= 10) { //조건식
			sum+= num;
			num++; //증감식
		}
		System.out.println("합계:"+sum);
		
		num = 11; //초기화
		sum = 0; //합계
		
		do {
			sum += num;
			num++; //증감식
		}while(num <= 10);  //조건식
		System.out.println("합계:"+sum);
		
		sum=0;
		for (int i=1; i<=10; i++) {
			sum+= i;
			
		}
		System.out.println("합계:"+sum);
		
		//구구단
		for(int dan=2; dan<=9; dan++) {
			for(int t=1; t<=9; t++) {
				System.out.println(dan+"X"+t+"="+(dan*t));
			}
			System.out.println();
		}
		
		
		int dan=2;
		while(dan<=9) {
			int t=1;
			while(t<=9) {
				System.out.println(dan+"X"+t+"="+(dan*t));
				t++;
			}
			System.out.println();
			dan++;
		}
		
		for (int i=0; i<10; i++ ) {
			if(i==4) {
				break;
			}
			System.out.println(i);
		}
		for (int i=0; i<10; i++ ) {
				if(i==4) {
				continue;
				}
			System.out.println(i);
		}
		
		//1~100까지 합계
		int total=0;
		for (int i=1;i<=100;i++)
				{
					total+=i;
				}
				System.out.println(total);
		
		//1~100중 짝수의 합계
		total=0;
		for (int i=1;i<=100;i++) {
			if(i%2==1) {
				continue;
				}
					total += i;
			}
				System.out.println(total);
				
		total=0;
		for(int i=2;i<=100;i+=2) {
			total+= i;
		}
		System.out.println(total);
		
		
		total=0;
		for (int i=1; i<=100; i++) {
			total += i;
			if (total > 100) {
			break;
			}
		}
		System.out.println(total);
		
		
	}
}
		
		

