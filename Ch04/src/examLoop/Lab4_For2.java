package examLoop;

import java.util.Scanner;

public class Lab4_For2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		
		int sum = 1;
		int n = sc.nextInt();
		
		for(int i = n; i >0; i--) {
			
			
			sum = sum*i;
			
		
		}

		System.out.println(n + "!" + "은" + sum);
	}

}
