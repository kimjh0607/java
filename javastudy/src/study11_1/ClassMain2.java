package study11_1;

import study01.Sysout;

public class ClassMain2 {
	public static void main(String[] args) {
	
	
	Calculator c1 = new MyMath();
	double res = c1.oper(3.0, 7.0);
	System.out.println(res);///0.0
	
	//익명클래스 x*y <---- Calculator
	Calculator c2 = new Calculator() {
		public double oper(double x, double y) {
			return x*y;
		}
	};
	
	System.out.println(c2.oper(3.0,7.0));////21.0
	
	//익명클래스 x^y <---- Calculator //math.pow이용
	Calculator c3 = new Calculator() {
		public double oper(double x, double y) {
			return Math.pow(x, y);
		}
	};
	
	System.out.println(c3.oper(3.0,7.0));///2187.0
	}
}


interface Calculator{
	public double oper(double x, double y);
	
	
class MyMath implements Calculator{
	@Override
	public double oper(double x, double y) {
		return x+y;
	}
	
}
	
	
	
	
	
	
	
}
//class MyMath <----- Calculator