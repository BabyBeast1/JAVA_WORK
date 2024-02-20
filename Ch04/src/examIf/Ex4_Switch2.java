package examIf;

import java.util.Scanner;

public class Ex4_Switch2 {

	public static void main(String[] args) {

		System.out.println("계절은? ");
		Scanner sc = new Scanner(System.in);
		String season = sc.nextLine();	// 문자열을 입력받기
		
		switch(season) {
		case "봄": 
			System.out.println("Spring");
			break;
		
		case "여름":
			System.out.println("Summer");
			break;
			
		case "가을":
			System.out.println("Fall");
			break;
			
		case "겨울":
			System.out.println("Winter");
			break;
			
		default:
			System.out.println("잘못된 계절입니다");
			break;
		}

	}

}
