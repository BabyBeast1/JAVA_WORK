package examLoop;

import java.util.Random;
import java.util.Scanner;

// 1 ~ 50 사이의 난수 맞히기
public class Ex4_DoWhile2 {

	public static void main(String[] args) {
		
		int r, user;
		
		// 임의의 난수 생성하기(1 ~ 50)
		r = (int)(Math.random()*50) + 1;
		
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("1 ~ 50 사이의 정수를 맞혀보세요!");
			user = scanner.nextInt();
			
			if( user > r ) System.out.println("더 작아요!");
			else if ( user < r) System.out.println("더 커요!");
		} while( user != r );	// 맞히지 못했다면 반복
		
		System.out.println("정답입니다!");
	}

}
