package examObject;

class Car {
	String kind;
	String color;
	Car(String kind, String color) {
		this.kind = kind;
		this.color = color;
	}
	@Override
	public String toString() {
		return kind + "(" + color + ")";
	}
}
public class Ex10_Car {

	public static void main(String[] args) {
		
		Car c = new Car("SportsCar", "red");
		System.out.println(c);
		System.out.println(c.toString());
	}
}
