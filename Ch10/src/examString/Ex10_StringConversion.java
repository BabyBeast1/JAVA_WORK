package examString;

public class Ex10_StringConversion {

	public static void main(String[] args) {
		
		// 정수를 문자열로 변경
		int i = 123;
		// 1번째
		String str = i + "";
		System.out.println(str);
		
		// 2번째
		str = String.valueOf(i);
		System.out.println(str);
		
		// 문자열을 정수로 변경
		// 1번째
		String str2 = "123 ";
		int i2 = Integer.parseInt(str2.trim());	// 문자열 끝 공백을 제거. 그래야 NumberFormatException예외 발생 제거
		System.out.println(i2);
		
		// 2번째
		i2 = Integer.valueOf(str2.trim());
		System.out.println(i2);
		
		// 문자열을 실수로 변경
		String str3 = "3.14";
		double d1 = Double.parseDouble(str3);
		System.out.println(d1);
		
		System.out.println(Integer.valueOf(i2) + Double.valueOf(d1));
	}
}
