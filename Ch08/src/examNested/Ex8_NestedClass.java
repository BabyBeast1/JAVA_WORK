package examNested;

class Outer{
	// field 선언
	private int i = 0;
	private static int s = 0;	// static field
	
	// instance클래스 선언. instance 멤버처럼 다뤄진다.
	class InstanceNested {
		void iMethod() {	// 외부클래스의 필드에 직접 접근 가능(private이어도)
			i = 10;
			s = 10;
		}
	}
	
	// static클래스 선언. static멤버처럼 다뤄진다.
	static class StaticNested{
		void sMethod() {
//			i = 20;	// 외부클래스의 인스턴스 필드에는 접근불가
			s = 20;
		}
	}
	
	void method() {
		// 지역변수 선언
		int fNum = 100;
		final int fNum2 = 200;
		
//		fNum = 200;
		// Local클래스 선언. 선언된 지역에서만 사용가능
		class LocalNested {
			void lMethod() {	// 외부클래스의 모든 필드에 접근가능
				i = 30;
				s = 30;
				// 로컬클래스에서 사용하는 순간 fNum은 상수로 간주된다.
				System.out.println(fNum);	// 상수만 접근 가능. (메소드는 종료되는 모든 지역변수가 사라지니까)
				
			}
		}
	}
}

public class Ex8_NestedClass {

	public static void main(String[] args) {
		
		// instance클래스 객체 생성 ==> 먼저 Outer클래스 객체 생성 후 
		Outer o = new Outer();	// 외부 클래스 객체 생성
		Outer.InstanceNested inner = o.new InstanceNested();
		
		// static클래스 객체 생성
		Outer.StaticNested inner2 = new Outer.StaticNested();
		
	}
}
