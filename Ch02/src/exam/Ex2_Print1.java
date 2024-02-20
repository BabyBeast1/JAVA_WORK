package exam;

public class Ex2_Print1 {

	public static void main(String[] args) {
		
		System.out.println(3 + "7" + "7");	// "3" + "7" --> "37" + "7" --> "377"
		System.out.println(3 + 7 + "7");	// 3 + 7 --> "10" + "7" --> "107"
		System.out.println("3" + 'a');		// "3" + 'a' --> "3a"
		System.out.println("3" + 7 + 7);	// "3" + "7" --> "37" + " 7" --> "377"
		
		int age = 20;
		String name = "이경호";
		System.out.println(name + "는 " + age + "살 입니다");

	}

}
