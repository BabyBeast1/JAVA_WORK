package exam;

public class Lab5_Array1 {

	public static void main(String[] args) {
		
		int[] arr = {60, 70, 80, 90, 99};
		
		System.out.print("성적 업데이트결과(+5) : ");
		for( int i = 0; i < arr.length; i++) {
			
			if(arr[i] < 95) {
				 arr[i] += 5;
				 
			} else {
				arr[i] = 100;
			}
			System.out.print(arr[i]);
		}
	}
}
