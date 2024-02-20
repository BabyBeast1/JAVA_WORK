package exam;

import java.util.Scanner;

public class Repeat {

	public static void main(String[] args) {
/*
		// n의 r제곱승 구하기

		Scanner sc = new Scanner(System.in);
		System.out.println("n 입력 : ");
		int n = sc.nextInt();

		System.out.println("r 입력 : ");
		int r = sc.nextInt();

		int x = 1;

		// for문, while문으로 작성

		for (int i = 1; i <= r; i++) {
			x *= n;
		}
		System.out.println(x);

		x = 1;
		int i = 0;

		while (i < r) {
			x *= n;
			i++;
		}
		System.out.println(x);
		*/
		
		int[] arr = new int[10];
		
		// 1 ~ 100 사이 난수를 저장
		
		arr[0] = (int)(Math.random()*100) + 1;
	}
}
