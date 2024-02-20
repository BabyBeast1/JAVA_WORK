package exam;

public class Ex3_Op {

	public static void main(String[] args) {
		
		int score = 85;
		char grade = ' ';	// 문자변수는 주로 공백으로 초기화
		
		// 조건연산자를 이용하여 홀수 짝수 판별
		int num = 2;
		System.out.println( num % 2 ==0? "짝수" : "홀수" );
		
		// 조건연산자를 중첩으로 사용하기
		grade = (score > 90) ? 'A' :(score > 80 ) ? 'B' : 'C';
		System.out.println(score + "점의 grade : " + grade);

		// 복합대입연산자
		num = 10;
		num += 10;
		System.out.println("num = " + num);
		num -= 10;
		System.out.println("num = " + num);
		num *= 10;
		System.out.println("num = " + num);
		num /= 10;
		System.out.println("num = " + num);
		num %= 10;
		System.out.println("num = " + num);
	}

}
