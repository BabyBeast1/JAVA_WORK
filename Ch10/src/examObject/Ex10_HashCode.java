package examObject;

public class Ex10_HashCode {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		// String 클래스는 equals가 오버라이딩되어있다.
		System.out.println(str1.equals(str2));
		
		// String 클래스는 hashCode가 오버라이딩 되어있다.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
	}
}
