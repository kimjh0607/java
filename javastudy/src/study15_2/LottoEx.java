/*package study15_2;

import java.util.*;

public class LottoEx {
	
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		
//		new LottoEx().lottoStart();
//		LottoEx lotEx = new LottoEx();
//		lotEx.lottoStart();
	
	
	public void lottoStart() {
		while(true) {  //반복시작
			
			lottoMenu(); 
			
			System.out.println("메뉴선택 : "); //탈출조건 메뉴,
			int menu = scan.nextInt();       //메뉴출력, 입력
			if(menu==2) {                     
				break;
			}else if(menu==1) {
				
			}else {
				System.out.println("번호입력오류");
			}
		//반복끝
		}
		
			
	}
	
	public void getLotto() {
		System.out.println("금액입력 : ");         //구매금액 입력
		int money = scan.nextInt();
		if(money<1000) {
			System.out.println("1000원이 안됩니다.");
			return;
		}else if(money>100000){
			System.out.println("십만원 초과 금액은 구매불가");
			return;
		}
		
		makeLotto(money);
		System.out.println("받은 금액 : "+money+"원");
		System.out.println("거스름돈 : "+(money%1000));
		
	}
	public void makeLotto(int money) {
		TreeSet<Integer> lottoSet = new TreeSet<>();  
		ArrayList<TreeSet<Integer>> lottoList = new ArrayList<>(); //로또번호생성 - 로또번호출력
		
		int count = money/1000;
		for(int i=0;i<count;i++) {
			TreeSet<Integer> lottoSet = new TreeSet<>();
			while(lottoSet.size()<6) {
				lottoSet.add((int)(Math.random()*45+1));
			}
			lottoList.add(lottoSet);
		}
		System.out.println("로또 번호 출력");
		for(int j=0;j<lottoList.size();j++) {
			System.out.println("로또번호 : "+(j+1)+":"+lottoList);
		}
	}

	public void lottoMenu() {
		System.out.println("Lotto 판매점");
		System.out.println("==메뉴======");
		System.out.println("1. Lotto 구입");
		System.out.println("2. 종  료");
		System.out.println("===========");
	}
	}



//Scanner scan = new Scanner(System.in)
//구매장수 scan/10
//출력 (math.random*46)+1
//들복 오름차순
 */
