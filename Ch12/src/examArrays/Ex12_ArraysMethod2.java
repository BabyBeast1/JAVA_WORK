package examArrays;

import java.util.Arrays;

public class Ex12_ArraysMethod2 {

	public static void main(String[] args) {
		
		// 1차원 문자배열 출력과 비교
		char[] arr = {'a', 'b', 'c'};
		char[] arr2 = {'a', 'b', 'c'};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.equals(arr, arr2));
		
		// 2차원 문자배열 출력과 비교
		char[][] arr3 = {{'a', 'b', 'c'}, {'d', 'e', 'f'}};
		char[][] arr4 = {{'a', 'b', 'c'}, {'d', 'e', 'f'}};
		
		System.out.println(Arrays.deepToString(arr3));
		System.out.println(Arrays.deepToString(arr4));		// 2차원 배열은 deepToString() 사용하여 출력
		System.out.println(Arrays.deepEquals(arr3, arr4));	// 2차원 배열은 deepEquals() 사용하여 비교
		
		// 정렬과 검색
		int[] score = {80, 60, 90, 50, 70};
		int index = Arrays.binarySearch(score, 70);
		System.out.println("70의 위치 : " + index); 	// 결과값 error
		
		// 정렬 먼저
		Arrays.sort(score);
		System.out.println(Arrays.toString(score));
		
		index = Arrays.binarySearch(score, 70);
		System.out.println("70의 위치 : " + index);
	}
}
