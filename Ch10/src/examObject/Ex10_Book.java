package examObject;

class Book {
	String title; // 제목

	Book(String title) { // 제목을 매개변수로 하는 생성자
		this.title = title;
	}

	@Override
	public boolean equals(Object obj) { // 책 제목이 같으면 true를 반환
		if (obj instanceof Book b2) {
			if (this.title.equals(b2.title))
				return true;
		}
		return false;

	}
	@Override
	public String toString() {
		return "제목 : " + this.title;
	}
}

public class Ex10_Book {

	public static void main(String[] args) {

		Book b1 = new Book("해리포터");
		Book b2 = new Book("해리포터");

		System.out.println("b1 == b2 : " + (b1 == b2));
		System.out.println("b1.equals(b2) : " + (b1.equals(b2)));
		
		System.out.println(b1);
	}
}
