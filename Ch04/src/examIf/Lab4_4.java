package examIf;

import java.util.Scanner;

public class Lab4_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		System.out.println("키를 입력하세요");
		int height = sc.nextInt();
		
		if ( age < 10 || height < 150) {
			System.out.println("놀이기구에 탑승할 수 없습니다");
		}
		else {
			System.out.println("놀이기구에 탑승할 수 있습니다");
		}

	}

}
