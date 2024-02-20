/* 조상타입의 참조변수 배열을 선언하여 자손들을 하나의 공통배열에 담아보자 */
package polymorphism;

class Grape extends Fruit {	// 포도
	Grape(String name, int price) {	// 객체의 생성과 필드의 초기화를 동시에 하기위한 생성자
		super(name, price);	// 조상의 생성자
	}
}

class Peach extends Fruit {	// 복숭아
	Peach(String name, int price) {
		super(name, price);	// 조상의 생성자
	}
}

class Watermelon extends Fruit {	// 수박
	Watermelon(String name, int price) {
		super(name, price);	// 조상의 생성자
	}
}

class Customer {	// 고객
	int money;	// 소유금액
	int cnt = 0 ;	// 배열의 개수를 세기위한 변수
	Fruit[]	basket = new Fruit[10];	// 과일을 10개까지 담을 수 있는 배열 선언 및 생성
	Customer(int money) {
		this.money = money;
	}
	
	void buy(Fruit f) {	// 과일을 구매하는 기능의 메소드
		if( money < f.price ) {
			System.out.println("돈이 부족하여 구매할 수 없습니다.");
		}
		else if( cnt >= basket.length ) {
			System.out.println("장바구니가 가득차서 더이상 담을 수 없습니다.");
		}
		else {
			basket[cnt++] = f;	// 장바구니에 과일 담기
			money -= f.price;
			System.out.println(f.name + " 구매");
		}
	}
	
	void showBasket() {
		System.out.println("장바구니 목록 --------------");
		for(int i=0; i<cnt; i++) {	// 내가 담은 개수만큼 반복
			System.out.println(basket[i].name + ", ");
		}
	}
	int getMoney() {
		return money;
	}
}

public class Ex7_FruitArray {

	public static void main(String[] args) {
		
		Customer customer = new Customer(100000);	// 10만원을 갖고 있는 고객 생성
		Grape g = new Grape("Grape", 17000);	// 1만 7천원짜리 포도 생성
		Peach p = new Peach("Peach", 25000);	// 2만 5천원짜리 복숭아 생성
		Watermelon wm = new Watermelon("Watermelon", 10000);	// 1만원짜리 수박 생성
		
		customer.buy(g);
		customer.buy(g);
		customer.buy(p);
		customer.buy(p);
		customer.buy(wm);
		customer.buy(new Apple("Apple", 5000));
		customer.showBasket();
		System.out.println("잔액: " + customer.getMoney());
	}
}
