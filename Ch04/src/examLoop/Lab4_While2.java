package examLoop;

import java.util.Scanner;

public class Lab4_While2 {

	public static void main(String[] args) {

		int x = 3;

		int sum = 0;

		while (x > 0) {

			System.out.println("정수를 입력하세요");

			Scanner sc = new Scanner(System.in);

			int a;

			a = sc.nextInt();

			sum += a;

			x--;

		}

		System.out.println("총합 : " + sum);

	}
	
}
