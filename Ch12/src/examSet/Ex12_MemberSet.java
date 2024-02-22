package examSet;

import java.util.HashSet;
import java.util.Objects;

class Member {
	int no;	// 회원 번호
	String name;	// 회원이름
	Member(int no,String name) {
		this.no = no;
		this.name = name;
	}
	
	@Override
	public String toString() {
	
		return name + "님의 회원번호는 " + no + "입니다";
	}
	
	@Override
	public int hashCode() {

		return Objects.hash(no, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Member m) {	// 매개변수로 전달된 객체가 Member 객체 라면
			if( name.equals(m.name) && no == m.no) return true;	// 이름과 회원번호가 같을 경우 true 반환 
		}
		return false;	// 그 외에는 모두 false 반환
	}
}

public class Ex12_MemberSet {

	public static void main(String[] args) {
		
		HashSet<Member> set = new HashSet<>();
		
		set.add(new Member(1, "김연숙"));
		set.add(new Member(2, "이경호"));
		set.add(new Member(3, "양현호"));
		set.add(new Member(4, "김연숙"));	// 동일회원 저장
		
		System.out.println(set);
	}
}
