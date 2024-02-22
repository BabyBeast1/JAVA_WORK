package examComparable;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class MyStudent {
	int ban;	// 반
	int no;	 	// 번호
	String name;	// 이름
	
	MyStudent(int ban, int no, String name) {
		this.ban = ban;
		this.no = no;
		this.name = name;
	}
	
	@Override
	public String toString() {
	
		return ban + "-" + no + " " + name;
	}
}

public class Ex12_ComparatorStudent {

	public static void main(String[] args) {
		
		TreeSet<MyStudent> set = new TreeSet<>(new Comparator<MyStudent>() {
			@Override
			public int compare(MyStudent o1, MyStudent o2) {
				
				// 반 번호 이름 순으로 오름차순 정렬되도록
					if( o1.ban < o2.ban ) return -1;
					else if( o1.ban > o2.ban ) return 1;
					else {	// 반이 같다면
//						if( o1.no < o2.no ) return -1;
//						else if ( o1.no > o2.no) return 1;
//						else return 0;	// 반도 같으면 0 반환
						return o1.no - o2.no;
					}
				}
		});
		set.add(new MyStudent(1, 2, "김연숙"));
		set.add(new MyStudent(1, 1, "홍길동"));
		set.add(new MyStudent(3, 2, "장보고"));
		set.add(new MyStudent(2, 3, "이순신"));
		set.add(new MyStudent(3, 1, "유관순"));
		set.add(new MyStudent(2, 2, "김유신"));
		
		Iterator<MyStudent> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
