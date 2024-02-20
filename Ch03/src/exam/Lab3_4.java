package exam;

import java.util.Scanner;

public class Lab3_4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("홈파티 인원은 몇 명인가요?");
		int x = scanner.nextInt();
		
		
		int a = (x%3 == 0) ? x/3 : x/3+1 ;
		int b = (x%4 == 0) ? x/4 : x/4+1 ;
		
		System.out.println("치킨은 " + a + "마리, " + "피자는 " + b + "판 주문해야 합니다.");
		
		

	}

}
