package chap09.ex04;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableMain {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new Hashtable<String, Integer>();
		
		map.put("김철수", 99);
		map.put("박동빈", 80);
		map.put("박은빈", 75);
		map.put("신솔비", 43);
		map.put("한은정", 52);
		map.put("김민지", 100);
		map.put("김윤경", 80);
		map.put("정철수", 99);
		map.put("안은호", 87);
		map.put("최영일", 75);
		// get(key) : 해당 키에 대한 값을 가져와라
		// containsKey(key) : 특정 key 가 존재하는지
		boolean contain = map.containsKey("박은빈");
		System.out.println("박은빈이 있나? " + contain);
		
		// conrainsValue(value) : 특정한 value 값이 존재하는지
		contain = map.containsValue(99);
		System.out.println("99점 학생이 있는가? " + contain);
		
		// get 을 이용하면 key 로서 값을 찾을 수 있지만 value 로서 key 를 찾을 수 없다.
		// 99점 학생은 누구누구인가?
		
		// 값을 꺼내오기 -> 값으로 key 를 가져오기
		
		//1. entry 로 분류
		Set<Entry<String, Integer>> entrySet = map.entrySet(); // Set 으로 담아놓고
		System.out.println(entrySet);
		//2. entry -> iterator
		Iterator<Entry<String, Integer>> iterSet = entrySet.iterator(); //entry 별로 자를 준비를 해놓는다.
		
		
		while(iterSet.hasNext()) { // 값이 있나?
			Entry<String, Integer> entry = iterSet.next(); //
			if (entry.getValue() == 99) {
				System.out.println("99점인 사람  = " + entry.getKey());
			}
		}
		
		for (String key : map.keySet()) {
			int vla = map.get(key);
			if (vla == 99) {
				System.out.println("99점인 학생 :" + key);
			}
		}
		
		for (Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			int val = entry.getValue();
			if (val == 99) {
				System.out.println(val + "점인 학생 = " + key);
			}
			
		}
		
		
		
		
		
	}

}
