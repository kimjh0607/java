package study06;

public class CarMain {
	CarMain(){}//기본생성자추가
	CarMain(String carName, String carType, int carHeight){
		this.carName = carName;//this - 인스턴스변수와 구분
		this.carType = carType;
		this.carHeight = carHeight;
	}
	String carName;
	String carType;
	int carHeight;
	
	void carSpeedUp() {
		System.out.println("가속");
	}
	void changeGear() {
		System.out.println("기어변속");
	}
	void carSpeedDown() {
		System.out.println("감속");
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName() {
		this.carName=carName;//this - 인스턴스변수와 구분
	}

	
	
	public static void main(String[] args) {

		
		
	}
	
}
