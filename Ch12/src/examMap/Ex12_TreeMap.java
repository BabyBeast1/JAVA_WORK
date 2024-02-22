package examMap;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex12_TreeMap {

	public static void main(String[] args) {
		
		TreeMap<String, String> tmap = new TreeMap<>();		// 영한사전
		tmap.put("strawberry", "딸기");
		tmap.put("banana", "바나나");
		tmap.put("melon", "메론");
		tmap.put("cherry", "체리");
		tmap.put("apple", "사과");
		tmap.put("grape", "포도");
		
		//	key를 기준으로 정렬된 상태 유지
		System.out.println(tmap);
		
		// 정렬된 entry 하나씩 가져오기
		Set<Entry<String, String>> entrySet = tmap.entrySet();
		for( Entry<String, String> entry : entrySet ) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println();
		
		// 특정 key에 대한 value 읽기
		Entry<String, String> entry;
		entry = tmap.firstEntry();
		System.out.println("첫번째 영단어: " + entry.getKey());
		System.out.println("첫번째 한글단어: " + entry.getValue());
		
		// 마지막 단어
		entry = tmap.lastEntry();
		System.out.println("마지막 단어: " + entry.getKey() + " - " + entry.getValue());
		
		// 체리 다음 단어 확인하기
		entry = tmap.higherEntry("cherry");
		System.out.println("cherry 다음 단어: " + entry.getKey());
		System.out.println();
		
		// 반복자를 통해 읽어오기
		Iterator<Entry<String, String>> itr = entrySet.iterator();
		while(itr.hasNext()) {
			entry = itr.next();
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}
