package examEnum;

import java.util.ArrayList;
import java.util.List;

class Parent {	// 조상
	void method() {}
}

class Child extends Parent {	// 자손
	// 오버라이딩을 맞게 했는지 컴파일러가 체크해준다.
	@Override
	void method() {
		
	}
}

public class Ex13_Annotation {

	// 경고메시지가 나타나지 않게 해준다.
	@SuppressWarnings({"rawtypes", "unused", "removal"})
	public static void main(String[] args) {
		
		// @Deprecated ==> 앞으로 사용하지 않을 것을 권장하는 멤버 앞에 붙인다.
		Integer n = new Integer(10);
		
		List list = new ArrayList();
	}
}
