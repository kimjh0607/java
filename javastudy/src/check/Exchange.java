package check;

import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {
		//유로1338 달러1229 두번 입력
		//한화로 얼마인지 산출
		//환율은 검색
				
		Scanner input = new Scanner(System.in);
		System.out.println("유로입력");
		double eur = input.nextInt();
		System.out.println("달러입력");
		double usd = input.nextInt();
		input.close();
		
		int sum = (int)(eur*1337.22 + usd*1228.30);
		System.out.println("한화총합: "+sum+" 원");
		
		
	}

}
