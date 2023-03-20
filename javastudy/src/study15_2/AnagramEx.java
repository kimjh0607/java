package study15_2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class AnagramEx {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		boolean result = isAnagram(a,b);
		System.out.print("두 단어는");
		System.out.println(result?"Anagram이다.":"Anagram이 아니다.");
		

		
	}
	
	static boolean isAnagram(String a , String b) {
		
//		char[] ac = a.toCharArray();                 //방법1
//		char[] bc = b.toCharArray();
//		
//		Arrays.sort(ac);
//	    Arrays.sort(bc);
//		
//		System.out.println(Arrays.equals(ac, bc));
//		return true;
		
		String[] aa = a.split("");                  //방법2
		String[] bb = b.split("");
		ArrayList<String> al = new ArrayList<>();
		ArrayList<String> bl = new ArrayList<>();
		al.addAll(Arrays.asList(aa));
		bl.addAll(Arrays.asList(bb));
		Collections.sort(al);
		Collections.sort(bl);
		return al.equals(bl)?true:false;
		
	}
	
}