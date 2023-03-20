package study03;

import java.util.*;

public class ArrayListRun {
	public static void main(String[] args) {
		//class 객체로 생성
		ArrayList<Integer>list1 = new ArrayList<Integer>(); //기본형 못씀 Integer로
		ArrayList<Integer>list2 = new ArrayList<>();
		ArrayList<Integer>list3 = new ArrayList<>(10);
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("안녕하세요");
		strList.add("안녕");
		strList.add("잘 가세요");
		System.out.println(strList);
		System.out.println(strList.size());
		System.out.println(list3.size()); //size는 크기X, 요소의 개수O
		
		strList.add(1,"종호"); //해당 인덱스에 삽입
		System.out.println(strList);
		System.out.println(strList.size());
		strList.set(2, "아름");//해당 인덱스에 대체
		System.out.println(strList);
		strList.remove("종호"); //동일객체 삭제
		System.out.println(strList);
		System.out.println(strList.size());
		strList.remove(2);
		System.out.println(strList);
		System.out.println(strList.size());
		strList.clear();//
		System.out.println(strList);
		System.out.println(strList.size());
		
		strList.add("이재민");
		strList.add("박만수");
		strList.add("강민정");
		strList.add("공승환");
		System.out.println(strList);
		
		for(int i=0;i<strList.size();i++) {
			System.out.print(strList.get(i)+" ");
			
		}
		System.out.println();
		for(String str : strList){
			System.out.print(" "+str);
		}
		
		System.out.println();
		
		//검색
		System.out.println(strList.contains("김준현"));
		System.out.println(strList.contains("공승환"));
		System.out.println(strList.indexOf("이재민"));
		System.out.println(strList.indexOf("김준현"));
		
		//복사
		System.out.println();
		//clone()
		ArrayList<String> newStr1 = (ArrayList<String>)strList.clone(); //형변환
		printArrayList(newStr1);
		System.out.println();
		//addAll()
		ArrayList<String> newStr2 = new ArrayList<>();
		newStr2.addAll(strList);
		printArrayList(newStr2);
		//for
		System.out.println();
		
		ArrayList<String> newStr3 = new ArrayList<>();
		for(String str:strList) {
			newStr3.add(str);
		}
		printArrayList(newStr3);
		System.out.println();
		
		//isEmpty()
		System.out.println(newStr3.isEmpty());
		newStr3.clear();
		System.out.println(newStr3.isEmpty());
		
		
		
		
		
		
	}
	static void printArrayList(ArrayList<String> arr) {
		for(String str:arr) {
			System.out.print(str+" ");
		}
	}
}
