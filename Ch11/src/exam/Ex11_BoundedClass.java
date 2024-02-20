package exam;

class NBox < T extends Number > {
	T data;
	void set(T data) {
		this.data = data;
	}
	T get() {
		return data;
	}
	
	// 제네릭 크래스라고 해서 모든 타입이 T여야 하는 건 아니다.
	// 타입 매개변수를 Number이하로 제한하게 되면 Number의 메소드를 사용가능
	// 만약, <T> 였다면 Object의 메소드만 사용가능.
	int intV() {
		return data.intValue();
	}
	double doubleV() {
		return data.doubleValue();
	}
}

public class Ex11_BoundedClass {

	public static void main(String[] args) {

		NBox<Integer> ibox = new NBox<>();	// Integer는 Number의 자손이다.
		ibox.set(10);
		Integer i = ibox.get();
		System.out.println(i);
		System.out.println(ibox.intV());
		System.out.println(ibox.doubleV());
		
		NBox<Double> dbox = new NBox<>();
		dbox.set(3.14);
		System.out.println(dbox.intV());
		System.out.println(dbox.doubleV());
		
//		NBox<String> sbox = new NBox<>();	// 타입 제한에 걸린다.
//		NBox<Fruit> fbox = new NBox<>();	// 타입 제한에 걸린다.
		
		
	}
}
