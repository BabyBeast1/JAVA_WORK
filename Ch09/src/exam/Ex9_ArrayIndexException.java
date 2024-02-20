package exam;

public class Ex9_ArrayIndexException {

	public static void main(String[] args) {
		
		try {
		String str = args[0];
		System.out.println("입력된 매개변수 : " + str );
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("입력된 매개변수가 없습니다.");
			return;	// finally 블럭 실행 후 return 한다.
		} finally {
			System.out.println("finally");
		}
		System.out.println("정상 종료");
	}
}
