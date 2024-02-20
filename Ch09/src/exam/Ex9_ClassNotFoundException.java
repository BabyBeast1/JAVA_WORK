package exam;

public class Ex9_ClassNotFoundException {

	public static void main(String[] args) {
		try {
			Class cls = Class.forName("java.lang.String");
			System.out.println(cls.getName());	// 클래스 이름 출력하기
		} catch( ClassNotFoundException e ) {
			System.out.println("클래스가 존재하지 않습니다");
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}
