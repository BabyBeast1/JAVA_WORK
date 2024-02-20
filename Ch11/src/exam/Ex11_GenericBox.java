package exam;

class GBox<T> {	// 제네릭 클래스 선언
	T data;
	void set(T data) {
		this.data = data;
	}
	T get() {
		return data;
	}
}

public class Ex11_GenericBox {

	public static void main(String[] args) {
		
		// 객체 생성할 때 타입을 대입해야 한다.
		GBox<String> sbox = new GBox<>();
		sbox.set("apple");
//		sbox.set(1);	// error. 컴파일단계에서 체크해줌.
		String str = sbox.get();	// 형변환 필요없다.
		System.out.println(str);
		
		GBox<Integer> ibox = new GBox<>();
		ibox.set(10);
//		ibox.set("apple");	// string 전달 불가
		Integer i = ibox.get();
		System.out.println(i);
		
	}
}
