package study15;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapInterfaceRun {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> tmap = new TreeMap<>();
		tmap.put(103, "Lee");
		tmap.put(102, "Kim");
		tmap.put(101, "Kim");
		tmap.put(102, "Hong");
		System.out.println(tmap.toString());
		System.out.println(tmap.size());
		
		HashMap<Integer, String> hmap = new HashMap<>(); /*{
			@Override
			public String toString() {
				return "해쉬맵속에서 오버라이딩";				
			}
		};                                                */
		hmap.put(103, "Lee");
		hmap.put(102, "Kim");
		hmap.put(101, "Kim");
		hmap.put(102, "Hong");
		System.out.println(hmap);
		System.out.println(hmap.size());
		
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();
		lmap.put(103, "Lee");
		lmap.put(102, "Kim");
		lmap.put(101, "Kim");
		lmap.put(102, "Hong");
		System.out.println(lmap);
		System.out.println(lmap.size());
		
		Hashtable<Integer, String> htable = new Hashtable<>();
		htable.put(103, "Lee");
		htable.put(102, "Kim");
		htable.put(101, "Kim");
		htable.put(102, "Hong");
		System.out.println(htable);
		System.out.println(htable.size());
		
		
		
	}
}
