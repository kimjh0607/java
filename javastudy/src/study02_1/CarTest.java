package study02_1;

import study02.Car;

public class CarTest {

	public static void main(String[] args) {
		Car c = new Car(); 
		//c.carNum(); 
		//int speed = c.speed; //default -같은 패키지내
		//c.getSpeed(); //protected -같은 패키지내(예외-상속)
		c.getCarNum(); //public -어디서든

	}

}
