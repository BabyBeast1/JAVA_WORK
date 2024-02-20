package exam;

public class Ex3_IncreDecre {

	public static void main(String[] args) {

		int x = 5, y = 5, z;
		
		// 단독으로 사용될 경우
		x++;
		System.out.println("x= " + x);	// x=6
		
		++y;
		System.out.println("y= " + y);	// y=6
		
		// 수식에 포함 될 경우 (전위)
		z = ++x;
		System.out.println("z= " + z);	// z=7, x=7
		
		// 수식에 포함 될 경우 (후위)
		z = y++;
		System.out.println("z= " + z);	// z=6, y=7
		
		// 메소드 호출에 포함되는 경우
		System.out.println("x= " + (x++));	// x=7 출력 후 x=8
		System.out.println(x);
		
		System.out.println("y= " + (++y));	// y=8, y=8 출력
		System.out.println("y= " + (y--));	// y=8 출력 후 y=7
		System.out.println(y);
		
		System.out.println("y= " + (y-1));	// y=6 출력 후 y에 결과값을 넣어주지 않았으므로 y값이 6으로 저장되지 않음
		System.out.println("y= " + y);		// 7
		

	}

}
