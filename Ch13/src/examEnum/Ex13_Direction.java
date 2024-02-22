package examEnum;

public class Ex13_Direction {

	public static void main(String[] args) {
		
		Direction direction;
		direction = Direction.RIGHT;
		System.out.println(direction.name());	// 상수이름 반환
		System.out.println(direction.ordinal());	// 내부적인 순서 반환
		System.out.println(direction.getValue());	// 지정한 상수값 반환
		
		Direction way1 = Direction.RIGHT;	// 0
		Direction way2 = Direction.UP;	// 2
		
		// compareTo()와 equals()가 오버라이딩 되어있다.
		System.out.println(way1.compareTo(way2));	// ordinal의 차이를 반환 0 - 2
		System.out.println(way2.compareTo(Direction.DOWN));	// ordinal의 차이를 반환 2 - 3
		
		// 컴파일러가 자동으로 추가해주는 메소드
		Direction[] ways = Direction.values();	// 열거형의 모든 상수를 배열로 반환
		for( Direction d : ways ) {
			System.out.println(d.name() + ": " + d.getValue());
		}
	}
}
