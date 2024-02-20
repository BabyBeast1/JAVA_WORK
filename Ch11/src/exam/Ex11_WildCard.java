package exam;

public class Ex11_WildCard {

	public static void showObjectBox(Box<Object> box) {
		System.out.println(box.getData());
	}
	
	// 제한이 없는 와일드카드
	public static void showAllBox(Box<?> box) {
		System.out.println(box.getData());
	}
	
	public static <T> void showAllBoxG(Box<T> box) {
		System.out.println(box.getData());
	}
	
	// 상한제한의 와일드카드
	// box는 Number이거나 Number의 자손박스만 받아줄 수 있다.
	public static void showNBox(Box<? extends Number> box) {
		System.out.println(box.getData());
	}
	
	public static <T extends Number> void showNBoxG(Box<T> box) {
		System.out.println(box.getData());
	}
	
	// 하한제한의 와일드 카드
	public static void showSuperBox(Box<? super Number> box) {
		System.out.println(box.getData());
	}
	
	
	public static void main(String[] args) {
		
		Box<Object> obox = new Box<>();
		showObjectBox(obox);
		Box<String> sbox = new Box<>();
//		showObjectBox(sbox); 	// error 제네릭 타입간에는 상속관계가 성립하지 않는다.
		// 조상타입으로 자손타입의 객체 참조 가능
		Box<Object> obox2 = new ChildBox<>();
		ChildBox<Object> cbox = new ChildBox<>();
		showObjectBox(cbox);	// 자손객체 전달 가능
		
		showAllBox(obox);
		showAllBox(sbox);
		
		showAllBoxG(obox);
		showAllBoxG(sbox);
		
//		showNBox(sbox);	// error
		Box<Integer> ibox = new Box<>();
		showNBox(ibox);	// ok
		
//		showNBoxG(sbox);	// error
		showNBoxG(ibox);	//ok
		
		showSuperBox(new Box<Number>());
//		showSuperBox(new Box<Integer>());	//error
	}
}
