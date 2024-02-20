package exam;

import java.util.Arrays;

// 배열을 생성하고 초기화하고 출력해보기
public class Ex5_Initialize {

	public static void main(String[] args) {
		// 정수배열
		int[] score;
		score = new int[] { 80, 92, 73, 85, 67 }; // 크기가 5인 정수배열 생성 & 초기화

		// 실수배열 선언 및 생성
		double[] dArr = new double[5]; // default값(0.0)으로 초기화

		
		// 문자배열 선언 및 생성 및 초기화
		char[] chArr =/* new char[] */ { 'a', 'b', 'c' };
		// 정수배열 출력하기
		score[2] = 78; // 3번째 점수 변경
//		score[5] = 100;		// 실행예외 발생
		System.out.println(score);
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println("\n" + Arrays.toString(score));

		// 실수배열 출력하기
		System.out.println(Arrays.toString(dArr));
		// 실수배열에 난수 저장하기
		for (int i = 0; i < dArr.length; i++) {
			dArr[i] = Math.random();	// 0.0 <= < 1.0 난수 생성 및 저장
			System.out.println(dArr[i]);
		}
		
		// 문자배열 출력하기
		for ( int i = 0; i < chArr.length; i++) {
			System.out.println(chArr[i]);
		}
		
		System.out.println();
		System.out.println(chArr);	// 문자배열일 경우는 sysout으로 출력가능

	}
}
