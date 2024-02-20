package examObject;

class Point {
	int x;
	int y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point pp) {
			if(this.x == pp.x && this.y == pp.y) 
					return true;
			else return false;
		} else return false;
	}
	@Override
	public String toString() {
		return "p (" + x + ", " + y + ")";
	}
}
public class Lab10_PointOverriding {

	public static void main(String[] args) {
		
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		
		System.out.println(p1);
		System.out.println(p1.equals(p2));
	}
}
