package examIf;

import java.util.Scanner;

public class Lab4_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		
		int x = sc.nextInt();
		
		if ( x >= 1 ) {
			System.out.println("양수입니다");
		}
		else if ( x == 0 ) {
			System.out.println("0입니다");
		}
		else {
			System.out.println("음수입니다");
		}

	}

}
