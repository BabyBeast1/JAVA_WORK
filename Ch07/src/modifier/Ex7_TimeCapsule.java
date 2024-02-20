package modifier;

public class Ex7_TimeCapsule {

	public static void main(String[] args) {
		
		Time t = new Time();
//		t.hour = 12; // 접근불가
		t.setHour(12);	// public 메소드를 통해서 필드값 설정
		System.out.println(t.getHour());
		t.setHour(-1);
		System.out.println(t.getHour());
		
//		t.min = 60; // 불가
		t.setMin(60);
		System.out.println(t.getMin());
		t.setMin(30);
		System.out.println(t.getMin());
		
	}
}
