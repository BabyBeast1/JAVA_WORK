package exam;

import java.util.Scanner;

public class Ex9_NumberFormatException {

	public static void main(String[] args) {
		
		while(true) {	// 정수가 입력될 때까지 반복.
			try {
				System.out.println("정수 입력 : ");
				Scanner sc = new Scanner(System.in);
				String str = sc.nextLine();	// 문자열 입력받기
				int num = Integer.parseInt(str);	// 문자열 -> 정수로 변환
				System.out.println("입력된 정수 : " + num);
				break;	// 정상적으로 정수가 입력되었다면 반복문 탈출
			} catch(NumberFormatException ne) {
				System.out.println("정수로 변환 할 수 없습니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
		System.out.println("끝");
	}
}
