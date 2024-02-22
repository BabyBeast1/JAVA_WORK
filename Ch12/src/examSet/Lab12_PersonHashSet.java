package examSet;

import java.util.HashSet;
import java.util.Objects;

class Person {
	String name;
	String telNo;
	Person(String name, String telNo) {
		this.name = name;
		this.telNo = telNo;
	}
	
	@Override
	public String toString() {
		
		return name + " " + telNo;
	}
	
	@Override
	public int hashCode() {
	
		return Objects.hash(name, telNo);
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person p) {
			if( name.equals(p.name) && telNo.equals(p.telNo) ) return true;
		}
		return false;
	}
}

public class Lab12_PersonHashSet {

	public static void main(String[] args) {
		
		HashSet<Person> set = new HashSet<>();
		set.add(new Person ("김연숙", "010-111-1111"));
		set.add(new Person ("김연숙", "010-111-1111"));
		System.out.println(set);
	}
}
