package examString;

import java.util.Scanner;

public class Lab10_CountVowel {

	public static void main(String[] args) {

		System.out.println("문자열을 입력하세요>");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Lab10_CountVowel cv = new Lab10_CountVowel();
		int cnt = countVowel(input);
		System.out.println("모음의 개수 : " + cnt);

	}

	static int countVowel(String input) {

		int cnt = 0;
		
		String vowel = "aeiou";
		
		for( int i = 0; i < input.length(); i++ ) {
			if( vowel.indexOf(input.charAt(i)) != -1) cnt++;
			
		}
		return cnt;
	}
}
