package study15_1;

import java.util.HashMap;

enum CoffeeType{Americano, IcedAmericano, CafeLatte}

public class EnumPrac {
	static void printCoffeePrice(CoffeeType type) {
		HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
		priceMap.put(CoffeeType.Americano, 3000);                   
		priceMap.put(CoffeeType.IcedAmericano, 4000);               
		priceMap.put(CoffeeType.CafeLatte, 5000);                   
		int price = priceMap.get(type);                        //메서드 'get' 
		System.out.printf("가격은 %d원 입니다.", price);
		
	}
	public static void main(String[] args) {
		printCoffeePrice(CoffeeType.Americano);              
	}
	
	
	
}
