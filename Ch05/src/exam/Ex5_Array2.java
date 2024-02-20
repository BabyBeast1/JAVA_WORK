package exam;

import java.util.Scanner;

// 크기가 5인 정수배열을 생성한 뒤, 사용자 입력으로 채운다.
// 그리고 입력받은 값들 중에서 최대값 최소값 차기

public class Ex5_Array2 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int max;	// 최대값을 찾기 위한 기준이 되는 변수
		int min;	// 최소값을 찾기 위한 기준이 되는 변수
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" 정수 5개를 입력하세요!'");
				for ( int i = 0; i < arr.length; i++) {
					arr[i] = sc.nextInt();
				}
				
				// 배열의 첫요소값으로 max와 min 초기화
				max = min = arr[0];
				
				// 최대값, 최소값 찾기
				for ( int i = 0; i <  arr.length; i++) {
					// max 보다 큰 값이라면 max값을 변경
					if( arr[i] > max ) max = arr[i];
					
					// min 보다 작은 값이라면 min 값을 변경
					else if( arr[i] < min )min = arr[i];
				}
				System.out.println("최대값 : " + max);
				System.out.println("최소값 : " + min);
	}
}
