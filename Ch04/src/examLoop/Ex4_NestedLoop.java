package examLoop;

// 구구단 전체를 출력하는 중첩 for문에서 break 사용하기
public class Ex4_NestedLoop {

	public static void main(String[] args) {
		for( int dan = 2; dan <= 9; dan++ ) {
			for( int i = 1; i <= 9; i++ ) {
				if ( i == 5 ) break;
				System.out.printf("%d * %d = %d\n", dan, i, dan * i );
			}
			System.out.println();
		}
	}
}
