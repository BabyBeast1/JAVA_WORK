package examLoop;
// 1 ~ 10 까지의 누적합계 구하기
public class Ex4_For2 {

	public static void main(String[] args) {

		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			System.out.printf("i:%d, sum:%d\n", i, sum);
		}
		System.out.println("1 ~ 10까지의 누적 합 : " + sum);

		// 1 ~ 10 까지의 누적곱 구하기
		
		int x = 1;
		
		for (int i = 1; i <=10; i++) {
			x = x * i;
			System.out.printf("i:%d, x:%d\n", i , x);
		}
		System.out.println("1 ~ 10까지의 누적 곱 : " + x);
	}

}
