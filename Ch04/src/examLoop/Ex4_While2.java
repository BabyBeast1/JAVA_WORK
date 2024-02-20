package examLoop;

import java.util.Scanner;

// 입력받은 정수의 각 자리수 합 구하기
public class Ex4_While2 {

	public static void main(String[] args) {
		
		int num;
		int sum = 0;	// 각 자리수의 합
		
		System.out.println("정수 입력: ");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		while ( num > 0 ) {
			sum += (num % 10);	// 일의 자리 구하기
			num /= 10;	// 십의 자리까지만 
		}
		System.out.println("각 자리수의 합 : " + sum);
	}
}
