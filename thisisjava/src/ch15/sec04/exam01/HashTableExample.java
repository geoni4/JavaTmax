package ch15.sec04.exam01;


import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<>();
		//저장 put(key, value);
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 85);
		
		//저장된 entry 개수 출력
		System.out.println(map.size());
		Set<String> keySet = map.keySet();
		for(String name:keySet)
			System.out.println(name + ": " + map.get(name));
		
		//Entry 추출
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> itor = entrySet.iterator();
		while(itor.hasNext()) {
			Entry<String, Integer> entry = itor.next();
			System.out.println(entry.getKey() +": " + entry.getValue());
		}
		
		//Entry 삭제
		map.remove("동장군");
		System.out.println(map.size());
		
	}
}
