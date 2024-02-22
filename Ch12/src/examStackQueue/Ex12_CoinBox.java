package examStackQueue;

import java.util.Stack;

public class Ex12_CoinBox {

	public static void main(String[] args) {
		
		Stack<Integer> coinbox = new Stack<>();
		coinbox.push(100);
		coinbox.push(500);
		coinbox.push(100);
		coinbox.push(50);
		
		while( !coinbox.isEmpty() ) {	// 스택이 비어있지 않을 동안 반복
			int coin = coinbox.pop();
			System.out.println(coin);
		}
	}
}
