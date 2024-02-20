package examList;

import java.util.LinkedList;
import java.util.List;

// 사람 클래스 선언
class Person{
	// 필드 선언
	String name;
	int age;
	
	// 생성자 선언
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + ": " + age;
	}
	
}

public class Ex12_LinkedList {

	public static void main(String[] args) {

		// List<Person> 또는 LinkedList<Person> 모두 가능
		List<Person> list = new LinkedList<>();
		
		Person p = new Person("김연숙", 20);	// 사람 1명 생성
		list.add(p);
		
		list.add(new Person("양현호", 21));
		list.add(new Person("이경호", 23));
		list.add(new Person("전용현", 22));
		list.add(new Person("홍길동", 24));
		// 다른 타입의 객체 추가할 수 없다.
		
		
		System.out.println(list);
		
		list.set(4, new Person("홍길동", 10));
		
		System.out.println(list);
		
		// 모든 객체 하나씩 꺼내오기
		for(int i = 0; i < list.size(); i++ ) {
			p = list.get(i);
			System.out.println(p);
		}
		
		// 2번째 사람 삭제
		list.remove(1);
		System.out.println(list);
	}
}
