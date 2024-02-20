package examIf;

import java.util.Scanner;

// 성적에 따른 학점 출력하기
public class Ex4_If2 {

	public static void main(String[] args) {

		int score;
		char grade = ' ';
		System.out.println("점수를 입력하세요 : ");
		
		Scanner scanner = new Scanner(System.in);	// Scanner 객체 생성
		score = scanner.nextInt();	//점수를 입력 받아 score에 저장
		
		if ( score >= 90 ) grade = 'A';
		else if (score >= 80 ) grade = 'B';
		else if (score >= 70 ) grade = 'C';
		else if (score >= 60 ) grade = 'D';
		else grade = 'F';

		System.out.println("당신의 학점은 : " + grade + "학점 입니다");
	}

}
