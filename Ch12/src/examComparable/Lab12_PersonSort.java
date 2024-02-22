package examComparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Person {
	String name;
	int age;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
	
		return name + " : "  + age; 
	}
}

public class Lab12_PersonSort {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<>();
		list.add(new Person ("김자바", 20));
		list.add(new Person ("박자바", 25));
		list.add(new Person ("이자바", 23));
		
		list.sort(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				if ( o1.age < o2.age ) return -1;
				else if ( o1.age > o2.age ) return 1;
				else {
					return o1.name.compareTo(o2.name);
				}
			}
		});
		Iterator<Person> it = list.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p);
		}
	}
}
