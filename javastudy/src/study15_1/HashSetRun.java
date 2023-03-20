package study15_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class HashSetRun {
	public static void main(String[] args) {
	Set<String> hset1 = new HashSet<>();       //객체생성
	HashSet<String> hset2 = new HashSet<>();   //객체생성
	
	hset1.add("일식이");                                        //추가
	hset1.addAll(Arrays.asList("이식이","삼식이","사식이","오식이"));//추가
	
	hset2.addAll(hset1);                    //다른객체로 내용이동
	//반복
	//향상된for문 Iterator사용
	
	//삼식이 있는지 확인하고 있으면 구식이 추가 없으면 오식이 삭제
	
	if(hset2.contains("삼식이")){
		hset2.add("구식이");
	}else {
		hset2.remove("오식이");
	}System.out.println(hset2);
	
	
	//배열로 변환해서 반복문 출력
	String[] arr = hset2.toArray(new String[0]);
	for(String str : arr) {
		System.out.print(str);
	}
	
	
	

	
	}

}
