package examList;

import java.util.ArrayList;
import java.util.List;

public class Ex12_ArrayList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(10);	// 배열의 크기를 10으로 초기화
		
		// 객체 추가.
		list.add("apple");
		list.add("grape");
		list.add("banana");
		list.add("strawberry");
		
		System.out.println(list);
		
		// 객체 변경
		list.set(2, "melon");	// 3번째 객체를 변경
		
		System.out.println("총 과일 수 : " + list.size());
		
		// 반복문으로 리스트 안의 객체들을 하나씩 읽어오기
		for(int i = 0; i < list.size(); i++) {
			String fruit = list.get(i);
			
			System.out.println(fruit);
		}
		
		// enhanced for문으로도 하나씩 읽어오기
		for( String s : list) {
			System.out.println(s);
		}
		
		// 첫번째 과일 삭제
		list.remove(0);
		
		System.out.println("현재 과일 : " + list);
		
		// melon의 위치 얻어오기
		int index = list.indexOf("melon");
		
		System.out.println("melon의 index : " + index);
		
		// 포함여부 확인하기
		if (list.contains("grape")) {
			System.out.println("grape가 있습니다.");
		}	else {
			System.out.println("grape가 저장되어 있지 않습니다.");
		}
		
	}
}
