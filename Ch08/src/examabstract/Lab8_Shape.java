package examabstract;

abstract class Shape{
	abstract double getArea();
}
class Circle extends Shape{
	
	int r;
	Circle(int r) {
		this.r = r;
	}
	
	@Override
	double getArea() {
		return r*r*3.14;
	}
}

class Triangle extends Shape{
	
	int l, l2;
	Triangle(int l, int l2){
		this.l = l;
		this.l2 = l2;
	}
	@Override
	double getArea() {
		
		return l * l2 * 0.5;
	}
}

class Rectangle extends Shape{
	
	int l3, l4;
	Rectangle(int l3, int l4){
		this.l3 = l3;
		this.l4 = l4;
	}
	@Override
	double getArea() {
		return l3 * l4 ;
	}
}
public class Lab8_Shape {

	public static void main(String[] args) {
		Circle  c = new Circle(5);
		Triangle t = new Triangle(3, 5);
		Rectangle r = new Rectangle(5, 10);
		Shape[] s = new Shape[] {c, t, r};
		// 모든 도형의 넓이를 출력
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i].getArea());
		}
	}
}
