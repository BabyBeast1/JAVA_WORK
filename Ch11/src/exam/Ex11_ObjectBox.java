package exam;

// 모든 타입의 객체를 처리할 수 있는 클래스
class OBox {
	Object obj;
	void set(Object obj) {
		this.obj = obj;
	}
	Object get() {
		return obj;
	}
}

class Toy {}
public class Ex11_ObjectBox {

	public static void main(String[] args) {
		
	OBox b = new OBox();	// 객체 생성
	b.set("apple");
//	b.set(1);	// 컴파일 단계에서 error 체크해주지 않는다.
	String str = (String)b.get();	// 형변환이 필요
	System.out.println("str : " + str);
	
	b.set(1);	// 오토 박싱
	Integer i = (Integer)b.get();	// Integer로 형변환
	
	b.set(new Toy());
	Toy t = (Toy)b.get();
	}
}
