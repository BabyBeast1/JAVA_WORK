/* Animal 추상클래스 선언하고 추상메소드 알아보기 */
package examabstract;

abstract class Animal {		// 추상클래스 선언
	String name;
	void sleep() {
		System.out.println("잡니다");
	}
	void breathe() {
		System.out.println("숨쉬다");
	}
	// 기능의 세부내용이 자손마다 다르다면 추상메소드로 선언
	abstract void makeSound();	
}
class Tiger extends Animal {	// 추상메소드를 완성해야만 에러가 사라짐
	@Override
	void makeSound() {
		System.out.println("어흥~ 어흥~ "); 
	}
}

// 추상클래스를 상속받는 자손클래스는 추상메소드를 오버라이딩해야만 한다.
class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("왈~ 왈~ ");	
	}
}

class Cow extends Animal {
	@Override
	void makeSound() {
		System.out.println("음메~ 음메~ ");
	}
}

public class Ex8_Animal {

	public static void main(String[] args) {

//		Animal a = new Animal();	// 추상클래스는 객체 생성불가. error
		Animal a = new Tiger();
		a.makeSound();
		Animal[] arr = {new Tiger(), new Cow(), new Dog()};
		for( int i = 0; i < arr.length; i++ ) {
			arr[i].makeSound();
		}
	}
}
