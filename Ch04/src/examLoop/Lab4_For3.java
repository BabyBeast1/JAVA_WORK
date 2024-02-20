package examLoop;

import java.util.Scanner;

public class Lab4_For3 {

	public static void main(String[] args) {
		
		System.out.println("단을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		a= sc.nextInt();
		
		int i;
		for( i = 1; i < 10; i++ ) {
		
			System.out.println( a + " * " + i + " = " + a * i);
			
		}
	}
}
