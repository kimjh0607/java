package test1;


import java.util.Scanner;


public class BMICalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("몸무게 입력(kg):");
		double weight = input.nextDouble();
		System.out.println("키 입력(m):");
		double tall = input.nextDouble();
		//BMI 지수 계산
		double bmi = calculateBMI(weight,tall);
		//BMI 지수로 비만도 결과 출력
		printBMIClassification(bmi);//출력을 위한 메소드(리턴자료형 void)
		
		
	}
	
	public static double calculateBMI(double weight , double tall) {
		return weight/Math.pow(tall, 2);//값을내어줌 return
	}
	
	public static void printBMIClassification(double bmi) {
		
		String bmiClass = "";
		
		if(30<=bmi) {
			bmiClass="비만";
		}else if(18.5<=bmi) {
			bmiClass="과체중";
		}else if(25<=bmi) {
			bmiClass="정상";
		}else {}
			bmiClass="저체중";
					
		System.out.printf("BMI : %.2f %n%s 입니다.",bmi,bmiClass);
		
		
		
		}
	
}
