package exam;

public class Ex9_ThrowsException {

	// x/y 결과값을 반환하는 메소드 선언. (예외 떠넘기기)
	static int divide(int x, int y) throws ArithmeticException {
		return x/ y;
	}
	
	public static void main(String[] args) {
		try {
			int result = divide(10, 0);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 순 없습니다.");
		}
		System.out.println("다음 단계로 넘어갑니다.");
	}
}
