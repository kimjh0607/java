package study15;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapRun {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();
		
		lmap.put(2, "홍길동");
		lmap.put(4, "김유신");
		lmap.put(3, "유관순");
		lmap.put(1, "이순신");
		System.out.println(lmap.toString());
		
		LinkedHashMap<Integer, String> lmap2 = new LinkedHashMap<>();
		lmap2.putAll(lmap);
		System.out.println(lmap2);
		
		lmap.putIfAbsent(5, "무지개");
		lmap.putIfAbsent(3, "무지개");
		System.out.println(lmap);
		
		lmap.replace(3, "김구");
		lmap.replace(9, "김구");
		System.out.println(lmap);
		
		System.out.println(lmap.get(3));
		System.out.println(lmap.getOrDefault(100, "기본값"));
		
		Set<Map.Entry<Integer, String>> entrySet = lmap.entrySet();
		System.out.println(entrySet.toString());
		
		Set<Integer> keyset = lmap.keySet();
		System.out.println(keyset);
		System.out.println(lmap.values());
		
		System.out.println(lmap.size());
		
		System.out.println(lmap.containsKey(4));
		System.out.println(lmap.containsKey(7));
		System.out.println(lmap.containsValue("김구"));
		System.out.println(lmap.containsValue("임꺽정"));
		
		System.out.println(lmap.remove(4));
		System.out.println(lmap.remove(2, "임꺽정")); //키값 일치 밸류값 불일치. 안지워짐
		System.out.println(lmap);
		System.out.println(lmap.remove(2, "홍길동")); //키값 일치 밸류값 일치. 지워짐
		System.out.println(lmap);
		
		lmap.clear();
		System.out.println(lmap.isEmpty());
		
		
		Set<Integer> kSet = lmap2.keySet();
		for(Integer key : kSet) {
			System.out.printf("키:%d 값:%s ", key, lmap2.get(key));
		}
		System.out.println();
		
		Iterator<Integer> keys = kSet.iterator();
		while(keys.hasNext()) {
			Integer key = keys.next();
			System.out.printf("키:%d 값:%s ", key, lmap2.get(key));
		}
		System.out.println();
		
		
		
		
		
	}
}
