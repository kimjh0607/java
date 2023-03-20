package study15_2;

import java.util.*;

public class CollectionEx {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70,40,30,20};
		Set<Integer> set = new HashSet<>();
		
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]+"\t"+(set.add(arr[i])?"성공":"중복")); //true if this set did not already contain the specified element
		}
		System.out.println("set"+set);
		
		
		
//		System.out.println(sList);
//		System.out.println(set);

//		System.out.println(arr[]);	
		
		
		
		
		


		
		//출력 
		/*
		 * 데이터 삽입
		 * 10 성공
		 * 
		 * 40 중복
		 */
		
		
		
	}

}
