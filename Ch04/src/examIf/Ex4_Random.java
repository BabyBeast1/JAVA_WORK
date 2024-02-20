package examIf;

public class Ex4_Random {

	public static void main(String[] args) {

		int r = 0;	// 난수 저장
		
		// 1 ~ 100 사이 난수
//		double d = Math.random(); // 0.0 ~ 0.9999999
//		
//		d = d * 100;	// 0.0 ~ 99.999999
//		
//		r = (int)d;		// 0 ~ 99
//		r = r + 1;		// 1 ~ 100

		r = (int)(Math.random() * 100) + 1;
		System.out.println("1 ~ 100 사이 난수 : " + r);
		
		// -5 ~ 5 사이의 난수 생성
		
		int x = 0;
		
		x = (int)(Math.random() * 11) - 5;
		System.out.println("-5 ~ 5 사이 난수 : " + x);
	}

}
