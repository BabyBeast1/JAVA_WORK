package exam;

public class Lab9_Exception1 {

	public static void main(String[] args) {
		
		try {
		int[] arr = new int[10];
		System.out.println(arr[10]);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("잘못된 인덱스입니다.");
		}
		System.out.println("프로그램 종료");
		
	}
}
