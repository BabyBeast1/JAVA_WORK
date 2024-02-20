package exam;

// 
public class Ex9_AccountException {

	public static void main(String[] args) {

		Account account = new Account();
		account.deposit(10000); // 만원 예금
		System.out.println("잔액 : " + account.getBalance());

		try {
			account.withdraw(20000);
		} catch (BalanceException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("잔액 : " + account.getBalance());
	}
	
}
