package examIf;

public class Lab4_1 {

	public static void main(String[] args) {
		
		// 1. int형 변수 num이 2의 배수 또는 3의 배수 일 때 true 인 조건식
		
		int num = 6;
		
		
		if (num%2 == 0 || num%3 == 0) {};
		
		// 2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		
		char ch= ' ';
		
		if (ch != ' ' && ch != '\t' ) {};
		
		// 3. char형 변수 ch가 'y' 또는 'Y'일 때 true인 조건식
		
		if (ch == 'y' || ch == 'Y' ) {};
		
		// 4. char형 변수 ch가 영문자(대문자 또는 소문자) 일 때 true인 조건식
		
		if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') ) {};
		
		// 5. boolean 형 변수 powerOn 가 false 일때 true인 조건식
		
		boolean powerOn;
		powerOn = false;
		
		if (powerOn == false) {};
		
		// 6. 문자열 참조변수 str이 'yes' 일 때 true인 조건식

		String str = "yes";
		
		if (str.equals("yes")) {};
		
	}

}
