package exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab9_Exception2 {

	public static void main(String[] args) {
		while(true) {
		try {
			System.out.println("두 정수를 입력하세요 : ");
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println("덧셈 결과는 : " + (num1+num2));
			break;
		} catch(InputMismatchException ie) {
			System.out.println("정수가 아닙니다!");
		}
		
		}
	}
}
