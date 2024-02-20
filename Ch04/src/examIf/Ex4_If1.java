package examIf;

import java.util.Scanner;

public class Ex4_If1 {

	public static void main(String[] args) {

		int age;
		Scanner scanner = new Scanner(System.in);
		System.out.println("현재 나이는?");
		age = scanner.nextInt();
		
		if (age > 20) {
			System.out.println("성인입니다");
		}
		else {
			System.out.println("성인이 아닙니다");
		}

	}

}
