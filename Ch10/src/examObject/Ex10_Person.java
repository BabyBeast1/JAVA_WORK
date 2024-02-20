package examObject;

import java.util.Objects;

class Person {
	String name;	// 이름
	String ssn;		// 주민번호
	Person(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Person p2) {	// obj가 참조하는 객체가 Person타입이라면 p2로 형변환
			if( name.equals(p2.name) && ssn.equals(p2.ssn)) return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, ssn);
	}
}
public class Ex10_Person {

	public static void main(String[] args) {
		Person p1 = new Person("김연숙", "111-2222");
		Person p2 = new Person("김연숙", "111-2222");
		
		System.out.println("p1 == p2 ? : " + (p1 == p2));	// 비교연산자의 결과값은 false
		if( p1.equals(p2)) {
			System.out.println("같은 사람입니다.");
		} else {
			System.out.println("다른 사람입니다.");
		}
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}
}
