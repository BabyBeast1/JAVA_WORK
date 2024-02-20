/*
 매개변수의 다형성 알아보기
 */
package polymorphism;

class Car2 {
	void run() {	// 자동차
		System.out.println("자동차가 달립니다.");
	}
}
class SportsCar extends Car2 {	// 자동차를 상속받는 스포츠카
	@Override
	void run() {
		System.out.println("스포츠카가 달립니다.");
	}
}
class Taxi extends Car2 {	// 자동차를 상속하는 택시
	@Override
	void run() {
	System.out.println("택시가 달립니다.");
	}
}
class Driver {	// 운전자
	// car가 어떤 객체를 전달받냐에 따라 다른 run()가 호출된다.
	// run메소드가 다양하게 동작한다. ==> 매개변수의 다형성 
	void drive(Car2 car) {	// 운전하는 기능.
		if ( car instanceof Taxi ) {	// 전달받은 객체가 Taxi라면.
			System.out.println("영업면허증이 필요합니다.");
		}
		car.run();
	}
}
public class Ex7_Driver {

	public static void main(String[] args) {
		
		Driver driver = new Driver();	// 운전자 생성
		Car2 car = new Car2();	// 자동차 생성
		SportsCar sc = new SportsCar();
		Taxi t = new Taxi();
		// 운전자가 자동차를 운전하게 하자.
		driver.drive(car);
		
		// 택시를 운전하게 하자
		driver.drive(t);
		
		// 스포츠카를 운전하게 하자
		driver.drive(sc);
	}
}
