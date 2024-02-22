package examSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Ex12_TreeSet {

	public static void main(String[] args) {
		
		// Integer는 Comparable을 구현하고 있다.(오름차순 정렬되도록)
		TreeSet<Integer> set = new TreeSet<>();
		int[] score = {80, 95, 75, 90, 38, 50, 17, 100};
		
		// 정수배열의 값들을 treeset에 저장
		for(int i=0; i < score.length; i++ ) {
			set.add(score[i]); // 오토박싱. 정렬된 상태를 유지한다.
//			System.out.println(set);
		}
		
		System.out.println("저장된 점수 : " + set);
		
		System.out.println("최저점수 : " + set.first());
		System.out.println("최고점수 : " + set.last());
		System.out.println("75점 바로 위의 점수 : " + set.higher(75));
		System.out.println("75점 바로 아래의 점수 : " + set.lower(75));
		
		System.out.println("50점 미만 : " + set.headSet(50));	// 50점 미만. 50점 포함 안됨
		System.out.println("50점 이상 : " + set.tailSet(50));	// 50점 이상. 50점 포함 됨
		System.out.println("50점 이하 : " + set.headSet(50, true));	// 50점 이하. 50점 포함 됨
		System.out.println("50점 초과 : " + set.tailSet(50, false));	// 50점 초과. 50점 포함 안됨
		
		System.out.println("50 ~ 80점 사이 : " + set.subSet(50, 81));	// 50점 이상, 81점 미만
		
		// 역순으로 정렬된 set을 얻고 싶을 때
		set.descendingSet();	// set은 변하지 않고 역순으로 정렬된 set을 반환한다.
//		System.out.println(set);
		System.out.println(set.descendingSet());
		
		// 아예 set을 역순으로 바꾸고 싶다면
		NavigableSet<Integer> nset = set.descendingSet();
		set = (TreeSet<Integer>)nset;
		System.out.println(set);
		
		while(!set.isEmpty()) {		// set이 비어있지 않다면 반복
			int s = set.pollFirst();	// 오토언박싱
			System.out.println(s);
			System.out.println("남아있는 객체 수 : " + set.size());
		}
	}
}
