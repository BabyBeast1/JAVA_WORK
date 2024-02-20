/*	Ex2_Scanner
 *	2024.1.4 이경호
 *	문자열 입력받기
 */

package exam;

import java.util.Scanner;	// import문 선언

public class Ex2_Scanner1 {

	public static void main(String[] args) {
		
		String string;	// 문자열을 저장하기 위한 변수 선언
		Scanner scanner = new Scanner(System.in);	//Scanner 객체 생성
		System.out.println("문자열을 입력하세요: ");
		string = scanner.nextLine();		//입력받은 문자열을 변수에 저장
		System.out.println("입력받은 문자열: " + string);
		
		
	}

}
