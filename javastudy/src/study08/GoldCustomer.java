package study08;

public class GoldCustomer extends Customer {
	private double saleRatio; //할인율
	
	public GoldCustomer(String customerName) {
		super(customerName);//밑변수들 this줄필요없다
		customerGrade = "Gold";
		bonusRatio = 0.03;
		saleRatio = 0.05;
		System.out.println("Gold customer 생성자");
		
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		return price-(int)(price*saleRatio);
		
	}
}
