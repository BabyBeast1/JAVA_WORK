package examString;

public class Ex10_StringMethod2 {

	public static void main(String[] args) {
		
		String str = "abc abc abc";
		
		// 'a'문자 등장횟수 세기
		int cnt = 0;
		for( int i = 0; i < str.length(); i++ ) {
			if( str.charAt(i) == 'a' ) cnt++;
		}
		
		System.out.println("'a' 문자의 등장횟수 : " + cnt);
		
		// abc 문자열이 몇번 등장하는지 세기
		System.out.println("\"abc\"문자열 등장 횟수: " + countSubString(str, "abc"));
	}
	
	static int countSubString(String target, String srch) {
		int index = 0;	// 문자열을 찾을 시작 위치
		int cnt = 0;
		
		while(true) {
			index = target.indexOf(srch, index);
			if( index != -1 ) {	// 찾았다면
				index += srch.length();	// 다음 찾을 시작위치 변경
				cnt++;
			}
			else break;	// 못찾았다면.. 끝까지 다 찾아봤다면
		}
		return cnt;
	}
}
