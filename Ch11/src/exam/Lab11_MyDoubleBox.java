package exam;

class MyDoubleBox<K, V> {
	K left;
	V right;
	
	void set (K left, V right) {
		this.left = left;
		this.right = right;
	}
	K getLeft() {
		return left;
	}
	V getRight() {
		return right;
	}
}

public class Lab11_MyDoubleBox {

	public static void main(String[] args) {
		
		MyDoubleBox<String, Integer> mdb = new MyDoubleBox<>();
		mdb.set("김연숙", 99);
		String name = mdb.getLeft();
		int score = mdb.getRight();
		System.out.println(name + " " + score);
		
		MyDoubleBox<String, String> mdb2 = new MyDoubleBox<>();
		mdb2.set("pitca.co.kr", "김연숙");
		String email = mdb2.getLeft();
		String id = mdb2.getRight();
		System.out.println(email + " " + id);
	}
}
