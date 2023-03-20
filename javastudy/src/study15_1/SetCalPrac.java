package study15_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SetCalPrac {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3,4,5,6));
		ArrayList<Integer> intersection = new ArrayList<>();
		ArrayList<Integer> union = new ArrayList<>();
		ArrayList<Integer> subtraction = new ArrayList<>();
		
//		intersection.addAll(list1);            //교집합1
//		intersection.retainAll(list2);
		
		for(int i=0; i<list1.size(); i++) {      //교집합2
			if(list2.contains(list1.get(i))) {
				intersection.add(list1.get(i));
			}
		}
		
//		union.addAll(list1);                        //합집합1
//		union.addAll(list2);
//		Set<Integer> listSet = new TreeSet<>(union);
//		System.out.println(listSet);
		
		for(int i:list1) {              //합집합2
			if(!(list2.contains(i))) {
				union.add(i);
			}
		}
		union.addAll(list2);
		
		
		
//		subtraction.addAll(list1);      //차집합1
//		subtraction.removeAll(list2);
		
		for(int i:list1) {              //차집합2
			if(!(list2.contains(i))) {
				subtraction.add(i);
			}
		}
		
		
		
		
		
		
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println("교집합"+intersection); //3,4
		System.out.println("합집합"+union);        //1,2,3,4,5,6
		System.out.println("차집합"+subtraction);  //1,2
		
		

	}

}
