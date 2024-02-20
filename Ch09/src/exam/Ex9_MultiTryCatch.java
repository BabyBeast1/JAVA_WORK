package exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex9_MultiTryCatch {

	public static void main(String[] args) {
		
		try {
			System.out.println("정수입력 : ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int result = 10 / num;
			System.out.println("result: " + result);
		} catch(ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch(InputMismatchException ie) {
			System.out.println("정수가 아닙니다.");
		} catch (Exception e) {		// 참조변수가 예외 차고조상인 catch블럭은 항상 마지막에 .
			System.out.println("예외 처리");
		}
		System.out.println("다음 단계로 진행합니다.");
	}
}
