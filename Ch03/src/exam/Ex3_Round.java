package exam;

public class Ex3_Round {

	public static void main(String[] args) {

		long result = Math.round(3.5);	// Math.round의 반환타입은 long
		System.out.println(result);
		
		double pi = 3.141592;	// 소수점이하 셋째자리까지
//		pi = pi * 1000;
		pi = Math.round(pi*1000)/1000.0;
//		pi = pi / 1000;
		System.out.println(pi);

	}

}
