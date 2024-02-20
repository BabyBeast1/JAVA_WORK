/*
 참조변수 형변환 알아보기
 */
package polymorphism;

class Person{}
class Student extends Person {}
class Bus extends Car {}
class Truck extends Car {}

public class Ex7_ClassCasting {

	public static void main(String[] args) {
		// 정상적인 형변환
		Student s = new Student();
		Person p = new Person();
		
		p = /*(Person)*/s;	// up casting일 경우에는 형변환연산자 생략가능
		s = (Student)p;		// down casting일 경우에는 형변환 연산자 필수
		
		// Classcasting 예외 발생되는 형변환
		Person p2 = new Person();
		Student s2 = new Student();
		if( p2 instanceof Student ) {
		System.out.println("Student로 형변환 가능합니다");
			s2 = (Student)p2;	// 결국, 자식타입으로 조상객체를 참조하는 꼴이 됨. 예외 발생.
		}
	}
}
