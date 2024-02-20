package exam;

public class Ex3_Arithmetic {

	public static void main(String[] args) {
		
		int a = 10, b = 3;
		
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);	// 정수나눗셈
		System.out.printf("%f / %d = %.1f\n", (float)a, b, (float)a/b);	// 실수나눗셈
		System.out.println((float)a/b);
		
		System.out.printf("%d %% %d = %d\n", a, b, a%b);

	}

}
