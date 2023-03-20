package study08;

import java.util.ArrayList;

public class PriceRun {
	public static void main(String[] args) {
		ArrayList<Customer> cusList = new ArrayList<>();
		Customer lee = new Customer("이순신");
		Customer hong = new Customer("홍길동");
	//	lee.setCustomerName("이순신");
		GoldCustomer sung = new GoldCustomer("성시경");
	//	sung.setCustomerName("성시경");
		VipCustomer kim = new VipCustomer("김정호","대동아");
		VipCustomer kong = new VipCustomer("공유","와이파이");
		
		cusList.add(lee);
		cusList.add(hong);
		cusList.add(sung);
		cusList.add(kim);
		cusList.add(kong);
		
				
		showCustomer(cusList);
		calcPriceAll(cusList,960000);//구매금액
		
				
		int price = 10000;
//		int costLee=lee.calcPrice(price);
//		int costSung=sung.calcPrice(price); //GoldCustomer의 calcPrice메서드
//		System.out.println(costLee);
//		System.out.println(costSung);
//		System.out.println(lee.getCustomerInfo());
//		System.out.println(sung.getCustomerInfo());
		
	}
	static void showCustomer(ArrayList<Customer> cusList){
		System.out.println("====고객====");
		for(Customer cus:cusList) {
			System.out.println(cus.getCustomerInfo());
		}
	}
	static void calcPriceAll(ArrayList<Customer> cusList,int price){
		System.out.println("====가격계산====");
		
		System.out.println("가격:"+price);
		for(Customer cus:cusList) {
			int cost = cus.calcPrice(price);
			System.out.printf("%s 고객님의 구매금액은 %d원입니다.\n",cus.getCustomerName(),cost);
			System.out.println(cus.getCustomerInfo());
		}
		
		
	}
}
