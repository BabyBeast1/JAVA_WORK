/*
 Guest와 Guest를 상속받는 MVG를 선언하고 getPoint() 오버라이딩하기
 */

package examoverriding;

class Guest{	// 고객
	// field
	int point;	// 보너스 점수
	
	// method
	void setPoint(int price) {	// 물건구입시 물건 가격에 5%를 포인트점수로 지급
		point += (int)(price * 0.05);
	}
	
	int getPoint() {
		return point;
	}
}
class MVG extends Guest {
	// 기능은 똑같이 존재하나, 세부 내용이 다르다면 오버라이딩해서 사용.
	@Override
	void setPoint(int price) {
		point += (int)(price * 0.1);	// 물건 가격에 10%를 포인트 점수로 지급
	}
}

public class Ex7_Guest {	

	public static void main(String[] args) {
		Guest g = new Guest();
		g.setPoint(100000);		// 십만원 구입
		System.out.println("적립 포인트 : " + g.getPoint());
		
		MVG mvg = new MVG();
		mvg.setPoint(100000);	// 십만원 구입
		System.out.println("적립 포인트 : " + mvg.getPoint());
		
	}
}
