package examIf;

import java.util.Scanner;

public class Lab4_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("필기 점수를 입력하세요");
		
		int x = sc.nextInt();
		
		System.out.println("실기 점수를 입력하세요");
		
		int y = sc.nextInt();
		
		if ( x >= 60 && y >= 60) {
			System.out.println("합격입니다");
		}
		else {
			System.out.println("불합격입니다");
		}
		

	}

}
