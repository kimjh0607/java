package weekend;

import java.util.Scanner;

public class afor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int sum=0;
		for(int i=a;i<=100;i+=1) {
			sum+=i;
		}System.out.println(sum);
		scan.close();
	}
}
