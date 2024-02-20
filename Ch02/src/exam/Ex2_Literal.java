package exam;

public class Ex2_Literal {

	public static void main(String[] args) {
		
		// 상수 사용하기
		final int MAX_SIZE = 10;
//		MAX_SIZE = 20;	// 값을 변경 할 수 없다.
		
		final char FIRST_NAME;
		FIRST_NAME = 'A';	// 값을 한번만 저장 가능
		
		// 리터럴 사용하기
		int num = 2100000000;	// 21억
		System.out.println(num);
		
		long num2 = 21_000_000_000L;	// 210억.	정수 리터럴의 default type은 int. 따라서 접미사 L 필요.
		System.out.println(num2);
		
		double num3 = 3.14;		// 실수 리터럴의 default type은 double
		System.out.println(num3);
		
		float num4 = 3.14F;		// 실수 리터럴의 float로 처리하기 위해선 접미사 f가 필요하다.
		System.out.println(num4);
		
	}

}
