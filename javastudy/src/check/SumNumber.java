package check;

import java.util.Scanner;

public class SumNumber {
	//자릿수의 합
	//세자리수를 입력받아 각 자릿수를 더하여 결과를 출력
	//단 세자리 정수가 아닌 경우 예외처리
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("세자리 정수입력");
		int num = input.nextInt();
		
		if(num<100) {
			System.out.println("입력오류");
		}else if(num>999) {
			System.out.println("입력오류");
		}else if(num<=999) {
			int H = num/100;
			int T = (num%100)/10;
			int O = (num%100)%10;
			int sum = H+T+O;
			System.out.print(sum);
		}
		/*or를 이용
		if(num<100 || num>999) {
			System.out.println("입력오류");
		}else if(num<=999){
			
		}
		*/
	
	}
}
