/*
 final 제어자 사용해보기
 */
package modifier;

final class FinalClass {}	// final class
// class ChildClass extends FinalClass{}	// error

class Parent {
	void method() {}
	final void finalMethod() {}	// final메소드
}

class Child extends Parent {	// 자손
	@Override
	void method() {
		// TODO Auto-generated method stub
		super.method();
	}
//	final void finalMethod() {}	// final 메소드는 오버라이딩 불가
}

class Card {
	// 인스턴스 final 필드
	final int num;		// 카드에 적힌 숫자
	final String kind;	// 카드의 무늬
	
	// static final 필드. 모든 객체들이 공유하는 하나의 상수.
	static final int CARD_CNT = 24;			// final static int 로 순서가 바뀌어도 됨.
	
	// 인스턴스 final 필드는 선언과 동시에 초기화하지 않는다면 생성자를 통한 초기화 필수
	Card(int num, String kind){
		this.num = num;
		this.kind = kind;
	}
}
public class FinalModifier {

	public static void main(String[] args) {
		
		Card c = new Card(3, "heart");
//		c.kind = "spade";	// 변경 불가. error
//		c.num = 5;			// 변경 불가. error
		
		System.out.println("카드는 총 " + Card.CARD_CNT + "장 입니다.");
//		Card.CARD_CNT = 25; 	// 변경 불가. error
	}
}
