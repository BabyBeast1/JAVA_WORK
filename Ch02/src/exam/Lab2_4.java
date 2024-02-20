package exam;

import java.util.Scanner;

public class Lab2_4 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int temp;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 정수 입력: ");
		a = scanner.nextInt();
		System.out.println("두번째 정수 입력: ");
		b = scanner.nextInt();
		
		scanner.close();
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("두 정수의 값을 교환하면 " + a + ", " + b + " 입니다");

	}

}
