package examStackQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class Ex12_Expression {

	public static void main(String[] args) {
		
		String exp = "((2 + 3) * ) - 5 ";	// 수식
		
		// stack구조를 사용하기 위해 ArrayDeque 사용하기
		Deque<Character> stack = new ArrayDeque<>();
		
		try {
			for ( int i = 0; i < exp.length(); i++ ) {
				if( exp.charAt(i) == '(' ) stack.push(exp.charAt(i));
				else if ( exp.charAt(i) == ')' ) stack.pop();
			}
			if ( stack.isEmpty() ) {
				System.out.println("괄호가 일치합니다");
			} else {
				System.out.println("괄호가 일치하지 않습니다");
			}
		}catch(NoSuchElementException e) {
			System.out.println("괄호가 일치하지 않습니다");
		}
	}
}
