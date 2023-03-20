package study14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListToArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> alist = new ArrayList<>(Arrays.asList(1,2,3,4));
		ArrayList<Integer> alist2 = new ArrayList<>(List.of(1,2,3,4));
		LinkedList<Integer> llist = new LinkedList<>(Arrays.asList(5,6,7,8));
		Vector<Integer> vec = new Vector<>(Arrays.asList(9,10,11,12));
		
		Object[] obj = alist.toArray();
		System.out.println(Arrays.toString(obj));
		
		Integer[] int1 = alist.toArray(new Integer[0]);
		System.out.println(Arrays.toString(int1));
		
		Integer[] int2 = llist.toArray(new Integer[0]);
		System.out.println(Arrays.toString(int2));

		Integer[] int3 = vec.toArray(new Integer[0]);
		System.out.println(Arrays.toString(int3));
		
		alist.addAll(alist2);
		System.out.println(alist);
		alist.addAll(llist);
		System.out.println(alist);
		alist.addAll(3, vec);
		System.out.println(alist);
		
		

	}

}
