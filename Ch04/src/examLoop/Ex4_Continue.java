package examLoop;

// 짝수만 제외하고 출력
public class Ex4_Continue {

	public static void main(String[] args) {
		for( int i = 1; i <= 10; i++ ) {
			if( i % 2 == 0 )continue;	// 짝수라면 제외해라.
			System.out.print(i + " ");
		}
	}
}
