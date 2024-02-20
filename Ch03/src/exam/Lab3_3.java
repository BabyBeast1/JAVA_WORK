package exam;

public class Lab3_3 {

	public static void main(String[] args) {

		int x = 10;
		int y = 5;
		char ch = 'a';	// 'a'의 유니코드는 97
		
		System.out.println( y >= 5 || x < 10 ); 	// True
		System.out.println( x++ );	//  10
		System.out.println( ++y );	// 6
		System.out.println( x += 1);	// 12
		System.out.println( (x % 5 == 0) && (y <10 ) );	// False
		System.out.println( 'A' <= ch && ch <= 'Z' );	// False
		System.out.println( ch - 1 );	// 96
		System.out.println( ++ch );		// b
		System.out.println( '3' - '0' );	// 3

	}

}
