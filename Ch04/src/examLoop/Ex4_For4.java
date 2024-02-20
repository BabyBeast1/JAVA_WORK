package examLoop;
// 구구단(2~9단) 출력하기
public class Ex4_For4 {

	public static void main(String[] args) {
		
		// 2단 출력
		for( int dan = 2; dan <=9; dan++) {
			for( int i = 1; i <=9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			}
			System.out.println();
		}
		
		//가로로 출력하기
		for( int i = 1; i <=9; i++) {
			for( int dan = 2; dan <=9; dan++) {
				System.out.printf("%d * %d = %d\t", dan, i, dan*i);
			}
			System.out.println();
		}

	}

}
