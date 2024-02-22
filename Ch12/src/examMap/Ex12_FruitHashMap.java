package examMap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex12_FruitHashMap {

	public static void main(String[] args) {
		
		// key는 String, value는 Integer
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("사과", 5000);
		map.put("바나나", 2900);
		map.put("포도", 7000);
		map.put("사과", 6000);	// 키가 중복되면?	해당 key의 value가 update된다.
		map.put("딸기", 10000);
		map.put("수박", 20000);
		
		System.out.println(map);
		
		System.out.println(map.remove("포도"));		// 포도의 value를 반환.
		System.out.println(map.remove("수박", 20000));	// 삭제 성공여부 반환
		
		Set<String> keyset = map.keySet();	// 키만 집합으로 반환
		System.out.println("과일목록 : " + keyset);
		
		// 과일이름 입력받아서 가격 출력하기
		System.out.println("검색할 과일은? : ");
		Scanner sc = new Scanner(System.in);
		String fruit = sc.nextLine();
		
		if( map.containsKey(fruit)) {
			System.out.println("가격 : " + map.get(fruit));
		}
		else {
			System.out.println("해당 과일은 없습니다");
		}
	}
	
}
