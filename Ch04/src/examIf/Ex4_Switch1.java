package examIf;

import java.util.Scanner;

/* 성적에 따른 등급 출력하기*/
public class Ex4_Switch1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성적을 입력하세요 : ");
		int score = sc.nextInt();
		
		switch(score/10) {
	
		case 9:	case 10:
			System.out.println("A등급입니다");
			break;
			
		case 8:
			System.out.println("B등급입니다");
			break;
			
		case 7:
			System.out.println("C등급입니다");
			break;
			
		case 6:
			System.out.println("D등급입니다");
			break;
			
		default : 
			System.out.println("F등급입니다");
			break;
			
			
		}

	}

}
