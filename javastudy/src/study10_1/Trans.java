package study10_1;

public abstract class Trans {
	int passengerCount;
	int income;
	
	public void take(int money) { //승객이 해당 교통수단을 이용
		passengerCount++;
		income += money;
	}
	
	public abstract void showInfo();
	
}
