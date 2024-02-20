package examLoop;

import java.util.Scanner;

public class Lab4_Break2 {

	public static void main(String[] args) {
		
		int a;
		int sum = 0;
		
		while(true) {
			System.out.println("양수를 입력하세요 : ");
			Scanner scanner = new Scanner(System.in);
			a = scanner.nextInt();
			if ( a < 0 ) break;
			sum += a;
			
		}
		System.out.println("양수들의 합계 : " + sum);
	}
}
