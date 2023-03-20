package study15_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListPrac {

	public static void main(String[] args) {
		//객체
		ArrayList<String> al = new ArrayList<>();
		//내용 추가 일식이... 칠식이
		al.add("일식이");
		al.add("이식이");
		al.addAll(Arrays.asList("삼식이","사식이","오식이","육식이","칠식이"));
		//반복 구문 출력
		//일반 for
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i));
		}System.out.println();
		
		//향상된 for
		for(String str : al) {
			System.out.print(str);
		}System.out.println();
		
		//iterator
		Iterator<String> iter = al.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next());
		}System.out.println();
		
		//삼식이 있는지 확인하고 있으면 구식이 추가 없으면 오식이 삭제
		if(al.contains("삼식이")) {
			al.add("구식이");
		}else {
			al.remove("오식이");
		}
		System.out.println(al);
		System.out.println();
				
		//배열로 반환해서 반복문으로 출력
		
		String[] array = al.toArray(new String[0]); //배열반환 문법 확인
		for(String str:array) {                     //반복문 확인
			System.out.print(str+" ");
		}System.out.println();
				
		
		
		
		

	}

}
