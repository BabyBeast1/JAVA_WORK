package exam;

import java.util.Arrays;

// 로또 번호 만들기
public class Ex5_Array3 {

	public static void main(String[] args) {
		int[] lotto = new int[45];	// 45개의 정수를 저장할 배열 생성
		int j, temp;	// 값 교환을 위한 정수
		
		// 배열에 1 ~ 45까지의 정수를 저장
		for(int i = 0; i < lotto.length; i++ ) {
			lotto[i] = i + 1;
		}
		// 섞기 전 출력
		System.out.println(Arrays.toString(lotto));
		
		// 모든 요소들에 대해 진행 (섞기)
		for( int i = 0; i < lotto.length; i++ ) {
			// 임의의 위치 선택 ( 0 ~ 44 )
			j = (int)(Math.random() * lotto.length);
			
			// [i]번째와 [j]번째 요소 교환
			temp = lotto[i];
			lotto[i] = lotto[j];
			lotto[j] = temp;
			
		}
		// 섞은 후 출력
		System.out.println(Arrays.toString(lotto));
		
		// 6개만 출력하기
		for ( int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
