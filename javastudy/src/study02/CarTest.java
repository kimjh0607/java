package study02;

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car(); //변수에 저장 'Car c' Car클래스?생성자? 불러오기 'new'
		//c.carNum(); // private(같은클래스내에서만.) 접근불가 
		//int speed = c.speed;
		c.getSpeed(); //protected
		c.getCarNum(); //public
		
	}

}
