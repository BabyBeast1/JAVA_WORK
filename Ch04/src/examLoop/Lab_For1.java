package examLoop;

public class Lab_For1 {

	public static void main(String[] args) {
		
		// 1~100 까지의 정수 중에서 3 또는 5의 배수인 수들의 총합 구하기
		
		int x = 0;
		
		for (int i = 0; i <= 100; i++ ) {
			if ( i%3 == 0 || i%5 == 0) {
				x= x+ i;
				System.out.printf("i:%d, x:%d\n", i, x);
			}
		}

	}

}
