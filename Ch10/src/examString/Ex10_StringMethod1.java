package examString;

public class Ex10_StringMethod1 {

	public static void main(String[] args) {
		
		String str = "Hello Java";
		
		// 문자열의 길이를 구하는 함수
		int length = str.length();
		System.out.println("문자열의 길이 : " + length);
		
		// 문자열 결합
		// 결합된 새로운 문자열을 str이 다시 참조하도록 해줘야 str이 바뀐다.
		str = str.concat(" World");
		System.out.println(str);
		
		str = str.replace("Java", "C");
		System.out.println(str);
		
		// 부분 문자열 뽑아내기
		String sub = str.substring(6);	// from 6 ~ 끝까지
		System.out.println("sub : " + sub);
		System.out.println("======================================");
		
		// 문자열 분리하기
		String[] arr = str.split(" ");	// 공백을 기준으로 분리하겠다.
		for( String s : arr ) {
			System.out.println(s);
		}
		// 문자배열안의 문자열들을 하나의 문자열로 연결하기
		String one = String.join(", " , arr);
		System.out.println(one);
	}
}
