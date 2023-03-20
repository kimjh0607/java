package study15_2;

import java.util.*;
import java.util.Map.Entry;

public class MapEx {
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		map.put("lee", 96);
		map.put("hong", 86);
		map.put("song", 92);
		
		
		String name = "";
		int maxPoint = 0;
		int totalPoint = 0;
		
//		//keySet
//		Set<String> set = map.keySet();
//		
//		for(String key0 : map.keySet()) {
//			Integer value = map.get(key0);
//			System.out.println(key0 +":"+ value);
//			totalPoint +=value;
//			maxPoint = (maxPoint<value)? value:maxPoint;
//			name = (maxPoint<= value)?key0:name;
//			System.out.println();
//		}
		

		//entrySet
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		Iterator<Entry<String, Integer>> iter = entrySet.iterator();
		while(iter.hasNext()) {
			Entry<String, Integer> entry = iter.next();
			String name2 = entry.getKey();
			int point = entry.getValue();
			totalPoint +=point;
			maxPoint = (maxPoint<=point)?point:maxPoint;
			name = (maxPoint<=point)?name2:name;
			
		}
		
//		for(Iterator iter = entrySet.iterator();iter.hasNext();) {
//			System.out.println(iter.next());
//		}
		
		System.out.println("평균점수 : "+totalPoint/map.size());
		System.out.println("최고점수 : "+maxPoint);
		System.out.println("최고 득점자 : "+name);
		
		
	}
}

class Student implements Comparable<Student> {

	String name;
	int score;
	
	Student(String name, int score){
		this.name=name;
		this.score=score;
	}
	
	@Override
	public int compareTo(Student o) {
		
		return 0;
	}
	
}









