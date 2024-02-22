package examSet;

import java.util.HashSet;
import java.util.Iterator;

public class Ex12_HashSet {

	public static void main(String[] args) {
		
		// String은 hashcode와 equals가 오버라이딩 되어있다.
		String[] arr = {"aaa", "bbb", "bbb", "ccc", "ddd", "ccc", "ccc"};
		
		HashSet<String> set = new HashSet<>();	// String을 담기위한 HashSet 객체 생성
		for( int i = 0; i < arr.length; i++) {
			set.add(arr[i]);	// 동일 객체를 제외하고 저장된다.
			System.out.println(set);
		}
		
		System.out.println("총 객체 수 : " + set.size());
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			if( str.equals("bbb")) itr.remove();
			System.out.println(str);
		}
		
		System.out.println("=====================");
		
		for( String s : set ) {	// 4회 반복
//			if(s.equals("bbb")) set.remove("bbb");	// error
			System.out.println(s);
		}
		
		set.remove("ddd");	// 특정 객체 삭제
		System.out.println(set);
		
		set.clear();// 모든 객체 삭제
		if(set.isEmpty()) {
			System.out.println("비어있음");
		} else {
			System.out.println("비어있지 않음");
		}
	}
}
