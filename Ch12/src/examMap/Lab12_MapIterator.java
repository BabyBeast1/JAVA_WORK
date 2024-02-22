package examMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Lab12_MapIterator {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		
		Set<String> keyset = map.keySet();
		
		Iterator<String> itr = keyset.iterator();
		while(itr.hasNext()) {
			String eng = itr.next();
			System.out.println(eng);
		}
		
		System.out.println();
		
		Collection<Integer> col = map.values();
		
		Iterator<Integer> num = col.iterator();
		while(num.hasNext()) {
			Integer num1 = num.next();
			System.out.println(num1);
		}
		
		System.out.println();
		
		Set<Entry<String, Integer>> entryset = map.entrySet();
		for (Entry<String, Integer> entry : entryset ) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
