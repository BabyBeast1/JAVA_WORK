package exam;

import java.util.Scanner;

// 암호 길이가 8글자 미만 일 경우 발생되는 예외 클래스 정의
class PwdException extends Exception {	// 예외처리가 필수인 예외 정의
	// 생성자 선언
	PwdException(String msg) {	// 예외메시지를 매개변수로 받는 생성자
		super(msg);	// 조상의 생성자 호출
	}
}
public class Ex9_PwdLengthException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("암호를 입력하세요 : ");
		String pwd = sc.nextLine();
		try {
			checkPwd(pwd);
		} catch(PwdException e) {
			System.out.println(e.getMessage());		// 예외메시지를 출력하기
			System.out.println("암호를 다시 만들어 주세요!");
		}
	}
	
	// 암호 길이를 체크하는 메소드 선언
	static void checkPwd(String pwd) throws PwdException {	// 발생가능한 예외 선언으로 떠넘기기 
		if( pwd.length() < 8 ) {
			PwdException e = new PwdException("8글자 미만입니다.");	// 예외 객체 생성
			throw e;	// 예외 객체 던지기
		}
		else {
			System.out.println("암호가 설정되었습니다.");
		}
	}
}
