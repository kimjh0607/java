package check;

import study07.Car;//다른 패키지

public class Taxi extends Car{
	Taxi(){
		super();
	//	this.carNum;//private
	//	int speed = this.speed;//default
	//	int speed = this.speed2;//
		this.getSpeed();//protected 상속은 여기까지
		this.getCarNum();//public
	}
}
