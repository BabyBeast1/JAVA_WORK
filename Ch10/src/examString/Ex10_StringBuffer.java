package examString;

public class Ex10_StringBuffer {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();	// 기본버퍼의 크기가 16으로.
		StringBuffer sb2 = new StringBuffer(20);	// 버퍼의 크기를 지정 가능.
		
		StringBuffer sb3 = new StringBuffer("abc");	// 버퍼의 크기 :  문자열의 길이 + 16
		StringBuffer sb4 = new StringBuffer("abc");
		
		System.out.println(sb3.equals(sb4));	// 오버라이딩 되어 있지 않다.
		
		String s1 = sb3.toString();	// String 객체로 변환 후 비교해야함.
		String s2 = sb4.toString();	
		System.out.println(s1.equals(s2));	
		
		// 문자열 덧붙이기
		sb3.append("def");
		System.out.println(sb3);
		
		// 문자열 중간에 추가하기
		sb3.insert(3, 123);	// 3index에 "123" 추가하기.
		System.out.println(sb3);
		
		// 문자열 삭제
		sb3.delete(3, 6);	// 3 ~ 5 index 사이의 부분문자열 삭제
		System.out.println(sb3);
		
		// 문자열 변경
		sb3.replace(3, sb3.length(), "ABC");	// 3 ~ 5까지의 문자열을 "ABC"로 변경
		System.out.println(sb3);
		
		//	19~ 33 lines 까지는 이렇게 한줄로 사용 가능
		sb3.append("def").insert(3, 123).delete(3, 6).replace(3, sb3.length(), "ABC");
		System.out.println(sb3);
		
		sb3.setCharAt(3, 'Z');	
		System.out.println(sb3);
		
		System.out.println(sb3.capacity());	// 버퍼의 크기
		System.out.println(sb3.length());
	}
}
