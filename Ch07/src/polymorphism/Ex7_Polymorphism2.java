package polymorphism;

class Car {
	// 필드, 생성자 생략
	// 메소드
	void run() { System.out.println("차가 달립니다"); }
	void stop() { System.out.println("차가 멈춥니다"); }
}

class FireEngine extends Car {	// 자동차를 상속하는 소방차
	void water() { System.out.println("소방차가 물을 뿌립니다~"); }
	@Override
	void run() {
		System.out.println("소방차가 달립니다");
	}
	@Override
	void stop() {
		System.out.println("소방차가 멈춥니다");
	}
}

public class Ex7_Polymorphism2 {

	public static void main(String[] args) {
		
	Car c = new FireEngine();	// 조상타입으로 자손객체 참조 가능
	// 자손에서 오버라이딩한 메소드가 호출된다.
	c.run();
	c.stop();
//	c.water(); // 조상의 멤버가 사용가능. error
		
	}
}
