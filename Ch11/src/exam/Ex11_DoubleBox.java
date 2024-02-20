package exam;

class Menu <K, V> {
	K kind;
	V value;
	
	void setKind(K kind) {
		this.kind = kind;
	}
	void setValue(V value) {
		this.value = value;
	}
	K getKind() {
		return kind;
	}
	V getValue() {
		return value;
	}
}

public class Ex11_DoubleBox {

	public static void main(String[] args) {
	
		Menu<String, Integer> menu = new Menu<>();
		menu.setKind("김밥");
		menu.setValue(5000);
		String kind = menu.getKind();
		int value = menu.getValue();	// 오토언박싱
		System.out.println(kind + ": " + value);
		
		menu.setKind("라면");
		menu.setValue(3000);
		kind = menu.getKind();
		value = menu.getValue();
		System.out.println(kind + ": " + value);
		
		
	}
}
