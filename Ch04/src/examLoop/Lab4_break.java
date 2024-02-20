package examLoop;

public class Lab4_break {

	public static void main(String[] args) {
		int r;
		
		while(true) {
			r = (int)(Math.random()*6 + 1);
			System.out.println("난수 : " + r);
			if(r == 3) break;
		}
	}
}
