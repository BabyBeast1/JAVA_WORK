package examString;

import java.util.Arrays;

public class Ex10_StringConstructor {

	public static void main(String[] args) {
		
		String str = "";	// 빈 문자열로 초기화
		System.out.println(str);
		
		// 문자열 -> byte 배열로 변환
		String str2 = "자바";	// 문자열 리터럴로 지정. UTF-8 인코딩(한글 1글자당 3바이트)
		byte[] bytes = str2.getBytes();
		System.out.println(bytes.length);
		System.out.println(Arrays.toString(bytes));
		
		// byte 배열 --> 문자열로 변환
		String str3 = new String(bytes);	// 기본 UTF-8 디코딩
		System.out.println(str3);
		
		char[] chArr = {'a', 'b', 'c', 'd', 'e'};
		String str4 = new String(chArr);
		System.out.println(str4);
		chArr = str4.toCharArray();
		System.out.println(chArr);	// 문자배열은 println으로 출력하면 문자열로 출력됨
	}
}
