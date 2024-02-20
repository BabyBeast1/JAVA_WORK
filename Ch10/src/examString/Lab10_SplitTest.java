package examString;

public class Lab10_SplitTest {

	public static void main(String[] args) {
		
		String ssn = "001234-9876543";
		
		String[] arr = ssn.split("-");
		
			System.out.println("앞자리 : " + arr[0]);
			System.out.println("뒷자리 : " + arr[1]);
		
	}
}
