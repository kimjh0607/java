package study03;

public class Recursive {
	//재귀함수 - 피보나치수열, 팩토리얼
	public static void main(String[] args) {
		System.out.println(fibonacci(7));
		System.out.println(factorial(4));
	}
	//|메소드이름|
	public static long fibonacci(long n) { //void와 long의 차이
		if(n<=2) {
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
	//팩토리얼
	public static long factorial(long n) {
		if(n<=1) {
			return 1;
		}
		return n*factorial(n-1);
		
	}
}
