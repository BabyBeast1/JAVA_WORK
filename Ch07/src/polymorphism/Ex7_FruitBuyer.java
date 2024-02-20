/*
 과일과 과일을 상속받는 클래스 선언.
 과일을 구매하는 구매자 클래스 선언.
 구매하는 메소드는 매개변수가 조상타입 --> 매개변수의 다형성
 */
package polymorphism;
class Fruit {
	// field
	String name;
	int price;
	// constructor
	// 객체 생성과 동시에 이름과 가격이 정해지도록 생성자 선언
	Fruit(String name, int price){
		this.name = name;
		this.price = price;
	}
}

class Apple extends Fruit {
	Apple(String name, int price) {	// 객체 생성과 동시에 이름과 가격이 정해지도록 생성자 선언
		super(name, price);		// 조상의 생성자 호출
		
	}
}

class Banana extends Fruit {
	Banana(String name, int price) {
		super(name, price);
	}
}

class Buyer {	// 구매자
	// field
	int money;	// 소유금액
	// constructor
	Buyer(int money){
		this.money = money;
	}
	// method
	// 매개변수가 Fruit 타입 ==> f는 Fruit 객체도, Apple, Banana도 전달받을 수 있다.
	void buy(Fruit f) {
		System.out.println(f.name + " 구입");
		money -= f.price;	// f가 참조하는 과일의 가격만큼 소유금액 차감
	}
	int getMoney() {
		return money;
	}
}
public class Ex7_FruitBuyer {

	public static void main(String[] args) {
		Buyer buyer = new Buyer(100000);	// 십만원을 소유한 구매자 생성
		Banana b = new Banana("바나나", 2000);	// 2천원짜리 바나나 생성
		Apple a = new Apple("사과", 5000);	// 5천원짜리 사과 생성
		buyer.buy(a);	// 사과 구매
		buyer.buy(a);	// 사과 구매
		buyer.buy(a);	// 사과 구매
		buyer.buy(a);	// 사과 구매
		buyer.buy(b);	// 바나나 구매
		System.out.println("현재 잔액: " + buyer.getMoney());
	}
}
