package examSet;

import java.util.HashSet;
import java.util.Objects;

class Student {
	int ban;	// 반
	int no;		// 번호
	String name;	// 이름
	
	Student(int ban, int no, String name) {
		this.ban = ban;
		this.no = no;
		this.name = name;
	}
	//	반-번호 이름 형식으로 출력될 수 있게 오버라이딩
	@Override
	public String toString() {
		
		return ban + "-" + no + " " + name;
	}
	
	@Override
	public int hashCode() {
	
		return Objects.hash(ban, no, name);	// 모든 인스턴스 필드를 전달하면 됨.
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Student s) {	// Student 타입이라면
			return ban == s.ban && no == s.no && name.equals(s.name);
		}
		return false;	// Student 타입이 아니라면 false 반환
	}
}

public class Ex12_StudentHashSet {

	public static void main(String[] args) {
		
		HashSet<Student> set = new HashSet<>();
		
		// 학생 객체 생성
		Student s1 = new Student(1, 2, "김연숙");	// 1반 2번 김연숙 생성
		Student s2 = new Student(1, 3, "홍길동");	// 1반 3번 홍길동 생성
		
		// 학생 객체를 hashset에 추가
		set.add(s1);
		set.add(s2);
		
		System.out.println(set);
		set.add(new Student(1, 2, "김연숙"));	// 1-2 김연숙
		set.add(new Student(1, 3, "홍길동"));
		
		System.out.println(set);
	}
}
