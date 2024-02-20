package examIf;

public class Lab4_Switch {

	public static void main(String[] args) {

		// 1~6 사이의 난수를 생성한 뒤 , switch문 을 이용하여 생성된 난수를 출력하기
		
		int x = 0;
		
		x = (int)(Math.random() * 6) + 1;
				
				System.out.println(switch(x) {
				case 6 -> '6';
				case 5 -> '5';
				case 4 -> '4';
				case 3 -> '3';
				case 2 -> '2';
				default -> '1';
				
				} + "이 생성 되었습니다.");
			
		}

	}


