package study15_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NumberConvert {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(7,3,2,1,1,2,9,6,4,7,3,5,8,10,4));
		System.out.println(numbers);
		
		//중복제거
		Set<Integer> numSet = new HashSet<Integer>(numbers); //Set중 TreeSet은 오름차순으로 정렬
		 if(numbers.size()!=numSet.size()) {
			 System.out.println("중복");
		}
		
		NavigableSet<Integer> numbers3= new TreeSet<>(numbers).descendingSet(); //역순
		System.out.println(numbers3.descendingSet());                           //의 역순
		 
		List<Integer> result = new ArrayList<>(numSet);
		System.out.println(result);
		
		//오름차순
		result.sort(Comparator.naturalOrder());
		System.out.println(result);
		
		//랜덤으로 (1~10사이) 20개의 숫자를 list에 저장하고 오름차순 내림차순으로 출력
		//중복제거 오름차순 내림차순으로 출력
		
		List<Integer> ranList = new ArrayList<>();
		for(int i=0; i<20; i++) {
			ranList.add((int)(Math.random()*9+1));  //랜덤으로 20개 추출, 리스트저장
		}System.out.println(ranList);
		
		Set<Integer> ranSet = new TreeSet<>(ranList); //TreeSet으로 옮김 - 중복제거 오름차순
		System.out.println(ranSet);
		NavigableSet<Integer> ranSet2 = new TreeSet<>(ranSet).descendingSet(); //내림차순
		System.out.println(ranSet2);
		
		
		
	
	}

}
