package exam;

public class Ex2_Var {

	public static void main(String[] args) {

		//정수형 변수
		int num = 10;	// 선언 및 초기화
		byte var1 = 127;	
//		byte var1 = 200;	// -128 ~ 127 까지만 가능
		
		//실수형 변수
		double r, pi = 3.141592;
//		System.out.println(r);	//초기화되지 않은 변수는 사용 할 수 없다
		
		//문자형 변수
		char ch = '가';	// 'a'의 unicode값이 저장.
		System.out.println(ch);
		
		//문자열형 변수
		String string = "abc";
		System.out.println(string);
		
		//논리형 변수
		boolean b = true;
		System.out.println(b);
		
		//두 변수의 값 바꾸기
		int x = 5;
		int y = 10;
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println(x);
		System.out.println(y);
		
	}

}
