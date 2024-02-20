package examIf;

import java.util.Scanner;

public class Lab4_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		
		int x = sc.nextInt();
		
		if ( x%2 == 0 ) {
			System.out.println("짝수 입니다");
		}
		else {
			System.out.println("홀수 입니다");
		}

	}

}
