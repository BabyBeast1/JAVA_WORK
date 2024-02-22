package examStackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Ex12_Queue {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		queue.offer("1.doc");
		queue.offer("2.ppt");
		queue.offer("3.xls");
		queue.offer("4.hwp");
		
		while( !queue.isEmpty() ) {		// 큐가 비어있지 않을 동안 반복
			System.out.println(queue.poll());
		}
	}
}
