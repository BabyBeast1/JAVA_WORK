package examEnum;

// 상수값을 지정하고 싶다면 괄호안에 값을 넣어준다.
// 그리고 값을 저장하기 위한 필드와 생성자가 필요하다.
public enum Direction {

	RIGHT(1), LEFT(3), UP(5), DOWN(7);	// 세미콜론 필요
	private final int value;	// 상수값을 저장할 필드 추가
	Direction(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}
