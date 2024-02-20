package examArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex12_ArraysMethod1 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		// arr 배열을 길이 2만큼만 복사(앞에서부터)해서 복사된 배열을 생성해서 반환.
		int[] copy1 = Arrays.copyOf(arr, 2);
		System.out.println(Arrays.toString(copy1));
		
		// 끝 인덱스는 포함 안됨. index 1 ~ 4 까지.
		int[] copy2 = Arrays.copyOfRange(arr, 1, 5);
		System.out.println(Arrays.toString(copy2));
		
		// System.arraycopy() 와 비교해보기
		// 복사 될 배열을 미리 만들어놔야 한다.
		int[] copy3 = new int[arr.length];
		System.arraycopy(arr, 0, copy3, 0, arr.length);
		System.out.println("copy3: " + Arrays.toString(copy3));
		
		Arrays.fill(copy3, 7);
		System.out.println("copy3: " + Arrays.toString(copy3));
		
		// Arraylist는 선언과 동시에 초기화가 안된다.
		// asList()를 사용하여 최값 있는 list 생성 가능 --> 단, 이 List는 fixed size의 리스트.
		List<Integer> list = Arrays.asList(1,2,3,4,5);
//		list.add(10);	// 실행예외 발생.
//		list.remove(0);	// 실행예외 발생.
		list.set(0, 10);	// 변경은 가능
		
		list = new ArrayList<>(list);	// 추가 삭제 가능한 리스트로 만들기 위해 다시 객체 생성하면서 list전달
		
		list.add(10);
		list.remove(0);
		System.out.println(list);
	}
}
