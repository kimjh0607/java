package test1;

import java.util.ArrayList;
import java.util.Arrays;

class Calculator{
		int value;
		Calculator(){
			this.value=0;
		}
		void add(int val) {
			this.value += val;
		}
		int getValue() {
			return value;
		}
		boolean isEven(int a) {
			return a%2==0 && a!=0;
		/*if(a%2==0 && a!=0) {
			return true;
		}
		return false; */
		}
		double avg(int[] arr) {////Array 메서드
			double sum=0;
			for(int o:arr) {
				sum+=o;
			}
			return sum/arr.length;
		}
		
		//double avg(ArrayList<Intener> arr) {
			
		}
			
	






class UpgradeCalculator extends Calculator {
	
	void minus(int val) {
		value -= val;
	}
}

class MaxLimitCalculator extends Calculator{
	int limit;//2)
	MaxLimitCalculator(int limit){ //1)int limit
		this.limit = limit; //3)this
	}
	@Override
	void add(int val) {
		value+=val;
		if(value>limit) {
			value = limit;
		}
	}
	
}



public class Exam08 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(10);
		System.out.println(cal.getValue());
//		UpgradeCalculator cal2 = new UpgradeCalculator();
//		cal2.add(10);
//		cal2.minus(7);
//		System.out.println(cal2.getValue());
//	
//		MaxLimitCalculator cal3 = new MaxLimitCalculator(100);
//		cal3.add(50);
//		cal3.add(60);
//		System.out.println(cal3.getValue());//100
	
		Calculator cal4 = new Calculator();
		System.out.println(cal4.isEven(3)); //홀수여부 판단 false
		System.out.println(cal4.isEven(4)); //짝수여부 판단 true
		System.out.println(cal4.isEven(0)); //짝수여부 판단 false
		
		Calculator cal5 = new Calculator();
		
		int[] data1 = {1,3,5,7,9};
		System.out.println((int)Math.round(cal5.avg(data1))); //5
		
		ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1,3,5,7,9));
		//System.out.println(cal5.avg(data2));//5
				
		
		
		
		
	
	}
}

