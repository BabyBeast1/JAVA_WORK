package inheritance;

class Rectangle {
	int width;
	int depth;
	// 매개변수 있는 생성자
	Rectangle(int width, int depth){
		this.width = width;
		this.depth = depth;
	}
	// getInfo() 메소드 선언
	String getInfo() {
		return width + "W " + depth + "D ";
	}
	int getArea() {
		return width * depth;
	}
}

class Cuboid extends Rectangle {
	int height;
	// 매개변수 있는 생성자
	Cuboid(int width, int depth, int height){
		super(width, depth);
		this.height = height;
	}
	
	@Override
	String getInfo() {
		// TODO Auto-generated method stub
		return super.getInfo() + height + "H";
	}
	
	@Override
	int getArea() {
		// TODO Auto-generated method stub
		return 2*(super.getArea() + depth * height + height * width);
	}
}

public class Lab7_Cuboid {

	public static void main(String[] args) {
		Rectangle s = new Rectangle(2, 4);
		System.out.println(s.getInfo());
		
		System.out.println("직사각형의 넓이 : " + s.getArea());
		
		Cuboid c = new Cuboid(3, 4, 5);
		String st = c.getInfo();
		System.out.println(st);
		
		System.out.println("직육면체의 겉넓이 : " + c.getArea());
	}
}
