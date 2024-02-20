package examLoop;

public class Lab4_For4 {

	public static void main(String[] args) {
		
		int i, j;
		int totalSum = 0, sum = 0;
		for(i = 1; i <= 10; i++) {
			sum=0;
			for(j = 1; j <= i; j++ ) {
				sum += j;
			}
			totalSum += sum;
		}
		System.out.println(totalSum);
	}
}
