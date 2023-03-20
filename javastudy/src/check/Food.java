package check;

public class Food {
	//치킨34인분, 왕만두 10인분, 쌀국수 12인분
	//가격 치킨:25000원, 왕만두:5000원, 쌀국수:8500원
	public static void main(String[] args) {
		int chi = 1 , chiprice = 25000;
		int dum = 1 , dumprice = 5000;
		int noo = 1 , nooprice = 8500;
		int sum = 34*chiprice+10*dumprice+12*nooprice;
		
		System.out.printf("치킨 %d마리: %8d\n",34*chi,34*chiprice);
		System.out.printf("왕만두 %d인분: %8d\n",10*dum,10*dumprice);
		System.out.printf("쌀국수 %d인분: %8d\n",12*noo,12*nooprice);
		System.out.println("=====================");
		System.out.printf("총합: %d",sum);
		
		
	}
}
