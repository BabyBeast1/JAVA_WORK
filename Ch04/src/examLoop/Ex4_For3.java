package examLoop;
// 3행 5열의 별 찍기
public class Ex4_For3 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			for (int j =0; j < 5; j++) {
				System.out.print("*");	// println 아님
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		// 직각삼각형 별 찍기
		
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
