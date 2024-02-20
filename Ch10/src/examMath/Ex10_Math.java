package examMath;

import java.util.Random;

public class Ex10_Math {

	public static void main(String[] args) {
		
		System.out.println("원주율 : " + Math.PI);
		System.out.println("2의 제곱근 : " + Math.sqrt(2));
		System.out.println(Math.rint(2.5));	// 가장 가까운 정수값을 double로 반환.(중간값일 경우는 짝수)
		System.out.println(Math.rint(3.5));	// 가장 가까운 정수값을 double로 반환.(중간값일 경우는 짝수)
		System.out.println(Math.rint(2.6));
		
		// 난수 생성
		Random random = new Random();
		int r = random.nextInt(6) + 1;	// (0 <= 난수 < 6) + 1	==> 1 ~ 6 사이의 정수난수 사용
		System.out.println(r);
		
		double d = random.nextDouble();	// 0.0 <= < 1.0
		System.out.println(d);
		
		// 100이상 200미만의 난수를 얻고 싶다면?
		Random random1 = new Random();
		int x = random1.nextInt(100) + 100;
		System.out.println(x);
	}
}
