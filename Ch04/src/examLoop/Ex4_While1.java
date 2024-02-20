package examLoop;

import java.util.Scanner;

// 입력받은 수부터 1까지 홀수만 출력하고 홀수의 개수 출력하기
public class Ex4_While1 {

	public static void main(String[] args) {
		
		int cnt = 0;	// 홀수 개수 카운팅
		System.out.println("정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("홀수들: ");
		while(num > 0 ) {
			if ( num % 2 == 1 ) {	// 홀수라면
				System.out.print(num + " ");
				cnt ++;
			}
			num --;
		}
		System.out.println("\n홀수들의 개수 : " + cnt);
	}
}
