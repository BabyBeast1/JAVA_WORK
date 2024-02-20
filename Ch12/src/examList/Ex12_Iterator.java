package examList;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex12_Iterator {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		list.add("이순신");
		list.add("김유신");
		list.add("안중근");
		list.add("한석봉");
		list.add("김연숙");
		
		// Iterator<>를 구현한 객체를 반환. 1회용
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {	// 읽어올 데이터가 있다면 반복
			String name = itr.next();	// 다음 데이터 읽어오기
			System.out.println(name);
			if( name.equals("김연숙")) {
				itr.remove();// 읽어온 데이터를 삭제
			}
		}
		
		System.out.println(list);
	}
}
