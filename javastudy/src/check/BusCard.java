package check;

import java.util.Scanner;

public class BusCard {
	/*
	 성인 만18세이상
	 청소년 만13세이상
	 어린이 만6세이상
	 유아 만5세이상
	 */
	public static String getRole(int age) {
		String role = " ";
		if(age>=18) {
			System.out.println("성인");
		}else if(age>=13) {
			System.out.println("청소년");
		}else if(age>=6) {
			System.out.println("어린이");
		}else {
			System.out.println("유아");
		}
		return role;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		String role = getRole(age);
		System.out.println(role);
	}
}
