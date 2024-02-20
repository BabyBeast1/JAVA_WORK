/*2024.1.4 이경호
 * 정수, 실수 입력받기
 */

package exam;

import java.util.Scanner;

public class Ex2_Scanner2 {

	public static void main(String[] args) {

		int num;
		double num2;
		
		Scanner scanner = new Scanner(System.in);	// 참조형변수 선언 및 객체 생성 & 생성된 객체의 주소를 참조변수에 저장.
		
		System.out.println("정수를 입력하시오 : ");
		num = scanner.nextInt();	// 정수를 하나 입력 받아 num에 저장
		System.out.println("입력된 정수 : " + num);
		
		System.out.println("실수를 입력하시오 : ");
		num2 = scanner.nextDouble();	// 실수를 하나 입력 받아 num2에 저장
		System.out.println("입력된 실수 : " + num2);
		

	}

}
