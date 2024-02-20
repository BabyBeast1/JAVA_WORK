package examIf;

import java.util.Scanner;

public class Ex4_If3 {

	public static void main(String[] args) {

		// 문자를 입력받아 판단하기
		char ch = ' ';
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 하나 입력하세요: ");
		String str = sc.nextLine();	// 문자열 입력받기
		ch = str.charAt(0);	// 문자열에서 맨앞의 문자 가져오기
		
		if( '0' <= ch && ch <= '9') {
			System.out.println("입력한 문자는 숫자문자입니다");
		}
		else if ( 'a' <= ch && ch <= 'z') {
			System.out.println("입력한 문자는 영문 소문자입니다");
		}
		else if ( 'A' <= ch && ch <= 'Z') {
			System.out.println("입력한 문자는 영문 대문자입니다");
		}
		else {
			System.out.println("영문/숫자 모두 아닙니다");
		}

	}

}
