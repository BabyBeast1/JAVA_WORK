package examComparable;

import java.util.Comparator;
import java.util.TreeSet;

class Student implements Comparable<Student> { // 비교할 객체의 타입을 지정
	String name;
	int score;

	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return name + " " + score;
	}

	@Override
	// o보다 작으면 음수, o보다 크면 양수, o와 같으면 0을 반환 ==> 오름차순
	public int compareTo(Student o) {
		if ( score < o.score ) return -1;
		else if( score > o.score ) return 1;
		else {	// 점수가 같아면 이름 오름차순으로 정렬되도록.
			return name.compareTo(o.name);
		}
	}
}

// 기본 정렬기준이 아닌 다른 정렬 기준을 제공하고 싶을 경우.
// Comparator를 구현한 클래스를 선언한 뒤, 해당 클래스의 객체 전달하기.
class NameAscending implements Comparator<Student> {
	
	// 이름기준으로 오름차순 정렬하고 싶다면
	// o1의 이름 < o2의 이름 일 때 음수를 반환
	@Override
	public int compare(Student o1, Student o2) {
		int ret = o1.name.compareTo(o2.name);
		
		if( ret < 0 ) return -1;
		else if ( ret > 0 ) return 1;
		else {	// 이름이 같다면 성적 내림차순으로
			return o2.score - o1.score;
		}
	}
}

public class Ex12_ComparableStudent {

	public static void main(String[] args) {

		// TreeSet은 compareTo메소드의 반환값이 0일 때 동일 객체로 판단한다.
//		TreeSet<Student> set = new TreeSet<>();
		TreeSet<Student> set = new TreeSet<>(new NameAscending() {
			@Override
			public int compare(Student o1, Student o2) {
				int ret = o1.name.compareTo(o2.name);
				
				if( ret < 0 ) return -1;
				else if ( ret > 0 ) return 1;
				else {	// 이름이 같다면 성적 내림차순으로
					return o2.score - o1.score;
				}
			}
		});
		set.add(new Student("김연숙", 100));
		set.add(new Student("조수연", 70));
		set.add(new Student("전용현", 88));
		set.add(new Student("홍길동", 99));
		set.add(new Student("이순신", 70));	// 점수가 같은 학생
		set.add(new Student("이순신", 80));	// 이름이 같은 학생
		System.out.println(set);
	}
}
