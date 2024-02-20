package exam;

// 제네릭 클래스 선언
class Box<T> {
	T data;
	void setData(T data) {
		this.data = data;
	}
	T getData() {
		return data;
	}
}

class ChildBox<T> extends Box<T> {}	// Box<T>를 상속받는 CildBox<T>

// 일반 클래스 선언
class MethodTest {
	
	// 제네릭 메소드 선언
	// T는 메소드 호출시 결정된다.
	<T> Box<T> makingBox(T data) {
		Box<T> box = new Box<>();
		box.setData(data);
		return box;
	}
	
	// 제한된 제네릭 메소드 선언
	// 여기에 대입될 수 있는 타입은 Number이거나 Number의 자손만 가능하다.
	<T extends Number> Box<T> makingNBox(T data) {
		Box<T> box = new Box<>();
		box.setData(data);
		return box;
	}
}

public class Ex11_GenericMethod {
	
	public static void main(String[] args) {
		
		// 제네릭메소드 호출. T에는 어떤 타입도 대입될 수 있다.
		MethodTest mt = new MethodTest();
		// 메소드 호출시 구체적인 타입을 지정. 생략가능
		Box<String> sbox = mt./*<String>*/makingBox("apple");
		String s = sbox.getData();
		System.out.println(s);
		
		Box<Integer> ibox = mt.makingBox(1);	// 오토박싱
		Integer i = ibox.getData();
		System.out.println(i);
		
//		mt.makingNBox("apple");	// error. Number이거나 Number의 자손만 가능
		
		ibox = mt.makingNBox(1);	// Integer는 Number의 자손이니까 가능.
		i = ibox.getData();
		System.out.println(i);
		
		Box<Double> dbox = mt.makingNBox(3.14);
		double d = dbox.getData();
		System.out.println(d);
		
	}
}
