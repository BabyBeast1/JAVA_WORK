package examComparable;

import java.util.Arrays;
import java.util.Comparator;

// String 클래스의 기본 정렬기준이 아닌 새로운 정렬기준을 제공하기 위해.
class LengthAscending implements Comparator<String> {
	
	// 문자열의 길이를 기준으로 오름차순 정렬되도록
	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();	// o1이 작을 때 음수를 반환하면 오름차순 정렬
	}
}

public class Ex12_ComparatorAnimal {

	public static void main(String[] args) {
		
		String[] animal = {"dog", "tiger", "elephant", "lion"};
		
		Arrays.sort(animal);
		System.out.println(Arrays.toString(animal));
		
		// Comparator를 구현한 클래스의 객체를 전달
		Arrays.sort(animal, new LengthAscending());
		System.out.println(Arrays.toString(animal));
	}
}
