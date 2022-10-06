package ch15.ex.exam09;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		int count = 0;
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> itor = entrySet.iterator();
		
		while(itor.hasNext()) {
			Entry<String, Integer> entry = itor.next();
			
			if(entry.getValue() > maxScore) {
				name = entry.getKey();
				maxScore = entry.getValue();
			}
			totalScore += entry.getValue();
			count += 1;
		}
		double avg = (double)totalScore/count; 
		System.out.println("평균 점수 : " + avg);
		System.out.println("최고 점수 : " + maxScore);
		System.out.println("최고 점수를 받은 사람 : " + name);
	}
}
