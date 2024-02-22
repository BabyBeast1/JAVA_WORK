package examStackQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class Lab12_ReverseString {

	public static void main(String[] args) {
		
		Deque<Character> stack = new ArrayDeque<Character>();
		
		String str = "Hello Java World!";
		
		for( int i = 0; i < str.length(); i++ ) {
			stack.push(str.charAt(i));
		}

		while( !stack.isEmpty()) {
			System.out.print(stack.pop());
			
		}
		
	}
}
