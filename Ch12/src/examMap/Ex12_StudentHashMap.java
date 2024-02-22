package examMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex12_StudentHashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("김연숙", 90);
		map.put("홍길동", 88);
		map.put("김연숙", 99);
		map.put("이순신", 75);
		map.put("박자바", 100);
		
		System.out.println(map);	// 김연숙은 99점이 된다.
		
		// keySet()을 통해서 key만 집합으로 받아오기
		Set<String> keyset = map.keySet();
		
		// 반복자 얻어오기
		Iterator<String> itr = keyset.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			int score = map.get(name);	// 학생의 점수 읽기
			System.out.println(name + ": " + score);
		}
		System.out.println("학생 명단: " + keyset);
		
		//	values()를 통해서 점수들만 받아오기
		Collection<Integer> values = map.values();
		System.out.println(values);
		
		int total = 0;
		// 반복자 얻어오기
		Iterator<Integer> itr2 = values.iterator();
		while( itr2.hasNext()) {
			total += itr2.next();	// 점수들의 누적합계 구하기
		}
		System.out.println("총점: " + total);
		System.out.println("평균: " + ((double)total / map.size()));
		System.out.println("최고점수: " + Collections.max(values));
		System.out.println("최소점수: " + Collections.min(values));
		System.out.println("======================================");
		
		// entrySet()을 통해 Map.Entry인터페이스를 구현한 객체(key-value 한쌍)들의 집합 얻어오기
		Set<Map.Entry<String, Integer>> entryset = map.entrySet();
		Iterator<Map.Entry<String, Integer>> itr3 = entryset.iterator();
		while( itr3.hasNext() ) {
			Map.Entry<String, Integer> entry = itr3.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
