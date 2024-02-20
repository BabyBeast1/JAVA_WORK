package exam;

// 잔액이 부족할 때 발생하는 예외 클래스 선언
class BalanceException extends Exception {	// 예외처리 필수
	// 생성자
	public BalanceException() {
		super();
	}
	public BalanceException(String msg) {	// 예외메시지를 매개변수로 받는 생성자
		super(msg);
	}
}

public class Account {

	private long balance;	// 잔액
	
	public long getBalance() {	// 잔액 조회
		return balance;
	}
	
	public void deposit(int money) {	// 예금
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceException {	// 출금
		if( balance < money ) {
			throw new BalanceException("잔액이 부족합니다.");
		}
		balance -= money;
	}
}
