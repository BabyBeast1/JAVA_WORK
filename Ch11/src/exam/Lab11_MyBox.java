package exam;

class MyBox<T> {
	T data;
	void setData(T data) {
		this.data = data;
	}
	
	T getData() {
		return data;
	}	
}
	
public class Lab11_MyBox {

	public static void main(String[] args) {
		MyBox<String> mb = new MyBox<String>();
		mb.setData("Harry Porter");
		
		String name = mb.getData();
		System.out.println(name);
		
		MyBox<Integer> mb2 = new MyBox<>();
		mb2.setData(38);
		int num = mb2.getData();
		System.out.println(num);
	}
}
