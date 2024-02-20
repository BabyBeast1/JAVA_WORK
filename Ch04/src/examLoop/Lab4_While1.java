package examLoop;

public class Lab4_While1 {

	public static void main(String[] args) {
		
		int i = 0 ; 
		
		while ( i < 3 ) {
			
			int j = 0 ;

			while( j < 5 ) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
