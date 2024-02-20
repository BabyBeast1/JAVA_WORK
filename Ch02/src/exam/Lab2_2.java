package exam;

public class Lab2_2 {

	public static void main(String[] args) {

		float a = 5.0f;
		final float Pi = 3.14f;
		
		float b = a*a*Pi;
		float c = (a+a)*Pi;
		
		System.out.printf("반지름이 %.1f인 원의 넓이는 %.1f 입니다\n", a, b);
		System.out.printf("반지름이 %.1f인 원의 둘레는 %.1f 입니다", a, c);

	}

}
