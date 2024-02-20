package examLoop;
// 총합이 100을 초과하는 순간, 반복을 멈추고 마지막에 더한 값 출력하기
public class Ex4_Break {

	public static void main(String[] args) {
		int num = 1, sum = 0;
		while(true) {	// 무한반복 for(;;)
			sum += num; // 누적합계
			if ( sum > 100 ) break;	// 100을 초과하면 탈출
			num++;
		}
		System.out.println("마지막에 더한 정수 : " + num);
	}
}
