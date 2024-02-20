package exam;

import java.util.Scanner;

class IdNullException extends Exception {
	public IdNullException(String msg) {
		super(msg);
	}
}

public class Lab9_IdNullException {

	public static void main(String[] args) {

		while (true) {
			System.out.println("아이디를 입력 : ");
			Scanner sc = new Scanner(System.in);
			String id = sc.nextLine();
			try {
				check_id(id);
				System.out.println("입력된 아이디 : " + id);
				break;
			} catch (IdNullException e) {
				System.out.println(e.getMessage());
			}
		}

	}

	static void check_id(String id) throws IdNullException {
		if (id.equals("")) {
			throw new IdNullException("입력된 아이디 없음!");
		}
	}
}
