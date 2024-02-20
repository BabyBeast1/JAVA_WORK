package examLoop;

import java.util.Scanner;

// 0 ~ 100 점 사이의 유효한 점수 입력받기
public class Ex4_DoWhile1 {

	public static void main(String[] args) {

		int score = 0;

//		do {
//			System.out.println("점수를 입력하세요(0~100) : ");
//			Scanner sc = new Scanner(System.in);
//			score = sc.nextInt();
//		} while(score < 0 || score > 100);	// 음수이거나 100점 초과라면 반복
//		System.out.println("입력된 점수 : " + score);

		// while 문으로 변경

		System.out.println("점수를 입력하세요(0~100) : ");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		while (score < 0 || score > 100) {

			System.out.println("점수를 입력하세요(0~100) : ");
			sc = new Scanner(System.in);
			score = sc.nextInt();
		}
		System.out.println("입력된 점수 : " + score);

	}
}
