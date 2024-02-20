package examIf;

import java.util.Scanner;

public class Ex4_Switch3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("성적 입력: ");
		int score = sc.nextInt();
		
		// 방법1
		// : 와 break 대신 -> 사용
		// , 이용
		switch(score / 10) {
		case 10,9 -> System.out.println("A등급입니다.");
		
		// 두개이상의 문장을 사용할 경우 {}사용
		case 8 -> {
			System.out.println("B등급입니다.");
			System.out.println("A등급을 향하여~");
			}
		case 7 -> System.out.println("C등급입니다.");
		default -> System.out.println("F등급입니다.");
		}

		
		// 방법2.	값 반환받아 처리하기. 이때는 default 필수.
		char grade = ' ';
		grade = switch(score/10) {
		case 10,9 -> { yield 'A'; }	// yield 사용시 중괄호 필수
		case 8 -> 'B';
		case 7 -> 'C';
		default -> {
		System.out.println("노력하세요!");
		yield 'F';
		}
		};
		
		// 방법3
		System.out.println(switch(score/10) {
		case 10,9 ->'A';
		case 8 -> 'B';
		case 7 -> 'C';
		default -> 'F';
		} + "등급입니다");
	}

}
