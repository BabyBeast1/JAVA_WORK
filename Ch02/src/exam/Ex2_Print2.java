package exam;

public class Ex2_Print2 {

	public static void main(String[] args) {
		
		String name = "이경호";
		int age = 20;
		char ch = 'a';
		double pi = 3.141592;
		
		System.out.printf("%s는 %d살 입니다\n", name, age);
		System.out.printf("[%-10s]는 [%-3d]살 입니다\n", name, age);
		System.out.printf("문자는 %c입니다\n", ch);
		System.out.printf("파이는 %f, %.2f, %.3f입니다\n", pi, pi, pi);
		// 소수점 포함해서 10자리로 출력하되, 소수점 이하는 3자리까지
		System.out.printf("파이는 [%10.3f]입니다", pi);

	}

}
