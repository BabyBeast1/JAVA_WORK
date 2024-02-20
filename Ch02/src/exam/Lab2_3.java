package exam;

import java.util.Scanner;

public class Lab2_3 {

	public static void main(String[] args) {
		
		int a;
		int b;
		
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		System.out.println("첫번째 정수 입력: " + a);
		
		b = scanner.nextInt();
		System.out.println("두번째 정수 입력: " + b);
		
		System.out.println("입력된 정수는 " +  a + "," + b + " 입니다.");

	}

}
