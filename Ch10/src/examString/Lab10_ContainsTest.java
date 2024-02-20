package examString;

public class Lab10_ContainsTest {

	public static void main(String[] args) {
		String str1 = "Write once, run anywhere";
		String str2 = "anywhere";
		
		if(str1.contains(str2)) {
			System.out.println("포함되어 있습니다.");
			
			str1 = str1.replace("anywhere", "everywhere");
			System.out.println(str1);
		} else {
			System.out.println("포함되어 있지 않습니다.");
		}
	}
}
