package exam;

public class Ex3_TypeCasting {

	public static void main(String[] args) {
		
		// 1. 형변환 연산자 사용하기
		double dVal = 3.14;
		
		int iVal = (int)dVal;	// 값 손실 발생
		System.out.println(iVal);
		
		byte bVal = (byte)200;
		System.out.println(bVal);
		
		// 2. 자동형변환 되는 경우 살펴보기
		iVal = /*(int)*/bVal; // 더 큰 타입으로의 형변환은 형변환연산자 생략가능
		dVal = /*(double)*/1000;
		
		// 피연산자의 타입이 다르다면 더 큰 타입으로 자동 형변환된다
		double result1 = 80/6;	// 정수나눗셈 ==> 몫(13)
		System.out.println("정수나눗셈 : " + result1);
		
		double result2 = (double) 80 / 6;	// 실수나눗셈	==> 80.0 / 6 ==> 80.0 / 6.0
		System.out.println("실수나눗셈 : " + result2);
		
		int c = 1_000_000;	// 백만
		int d = 1_000_000;	// 백만
		long result4 = (long)c * d;	// 1조. overflow ==> long * int => long * long(자동형변환)
		System.out.println("result4 : " + result4);
		
		// int보다 작은 타입이 산술연산식에서 사용될 경우 int로 자동형변환
		byte a = 5, b = 20;
		byte result3 = (byte)(a * b);
		System.out.println(result3);
		
		// 문자열 + anyType
		String strVal = "java" + 21;
		System.out.println(strVal);
	}

}
