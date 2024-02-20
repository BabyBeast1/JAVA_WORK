package examLoop;

public class Lab4_While3 {

	public static void main(String[] args) {
		
		int a = 1;
		int sum = 0;
		
		while( a <= 50){
			if( a % 2 == 0) {
				sum += a;
			}
			a++;
		}
		System.out.println("짝수들의 누적합 : " + sum);
	}
}
