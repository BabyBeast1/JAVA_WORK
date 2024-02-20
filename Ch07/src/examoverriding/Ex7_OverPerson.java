/*
 Person을 상속하는 Student를 정의하고 getInfo() 오버라이딩하기 
 */

package examoverriding;

class Person {
	// field 선언
	String name;
	int age;
	
	// constructor 선언 (생성자 선언). 객체 생성과 필드 초기화를 동시에 하기 위해 매개변수 있는 생성자 선언
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// method. 이름과 나이정보를 문자열로 반환하는 메소드
	String getInfo() {
		return name + ", " + age;
	}
}

// Person을 상속하는 Student 클래스 정의
class Student extends Person {
	String stId;	// 학번
	Student(String name, int age, String stID) {
		super(name, age);	// name, age는 조상의 생성자에서 초기화하도록 조상의 생성자 호출
		this.stId = stID;
	}
	// 오버라이딩
	@Override
	String getInfo() {
		return super.getInfo() + ", " + stId;
	}
}

public class Ex7_OverPerson {

	public static void main(String[] args) {
		Student s = new Student("이경호", 20, "240101");
		System.out.println(s.getInfo());
	}
}
