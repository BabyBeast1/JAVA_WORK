package examMath;

public class Ex10_Wrapper {

	public static void main(String[] args) {
		
		// Wrapper 객체 생성
		Integer obj1 = /*Integer.valueOf*/200;	// 오토 박싱
//		Integer obj2 = new Integer(200);	// 생성자를 통한 생성은 금지.
		
		// 문자열을 객체로 변환
		Integer obj3 = Integer.valueOf("200");
		int i = Integer.valueOf("200");		// 오토언박싱
		Double obj4 = Double.valueOf("3.14");	// 실수문자열을 실수로 변환
		
		// wrapper 객체로부터 기본형값 읽어내기
		int v1 = obj1.intValue();
		int v2 = obj1;	// 오토언박싱
		System.out.println(v1);
		
		double d1 = obj4.doubleValue();
		d1 = obj4;		// 오토 언박싱
		
		// 값 비교
		System.out.println(obj1 == obj3);
		System.out.println(obj1.equals(obj3));
		Integer obj5 = 300;
		
		// compareTo() : a == b : 0, a < b ==> -1, a > b : 1
		System.out.println(obj1.compareTo(obj5));
		System.out.println(obj5.compareTo(obj1));
		System.out.println(obj1.compareTo(obj3));
		
		System.out.println("MAX+VAL : " + Integer.MAX_VALUE);
		System.out.println("MIN+VAL : " + Integer.MIN_VALUE);
	}
}
