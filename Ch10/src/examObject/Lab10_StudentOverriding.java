package examObject;

class Student {
	String name;
	int score;
	Student (String name, int score) {
		this.name = name;
		this.score = score;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student s1) {
			if (name.equals(s1.name) && score == s1.score) return true; 
			else return false;
		} else return false;
	}
	@Override
	public String toString() {
		return name + " " + score;
	}
}
public class Lab10_StudentOverriding {

	public static void main(String[] args) {
		Student st1 = new Student("김연숙", 99);
		Student st2 = new Student("김연숙", 99);
		System.out.println(st1.equals(st2));
		System.out.println(st1);
	}
}
