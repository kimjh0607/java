package check;

import study07.Car;//다른 패키지

public class CarOut {
	
	public void carMethod() {
		Car c = new Car();
	//	c.carNum;//private
	//	int speed = c.speed;//default
	//	c.getSpeed(); //protected
		c.getCarNum();//public

	}

}
