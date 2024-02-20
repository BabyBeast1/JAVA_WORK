/*
 조상타입의 참조변수로 자손객체를 참조해보기
 */
package polymorphism;

class Animal {
	// 필드, 생성자 생략
	// method
	void move() {
		System.out.println("움직이다");
	}
	void makeSound() {
		System.out.println("소리를 내다");
	}
	
}

class Cat extends Animal {
	void claw() {
		System.out.println("할퀴다");
	}
		
		@Override
		void makeSound() {
			System.out.println("야옹~ 야옹~");
		}
}

public class Ex7_Polymorphism {

	public static void main(String[] args) {
		
		// 지금까지 했던 기본적인 방법
		Animal a = new Animal();
		Cat c = new Cat();
		
		// c 참조변수로 3개의 메소드 모두 사용 가능
		c.move();
		c.makeSound();
		c.claw();
		
		a = new Cat();	// 조상타입으로 자손객체 참조 가능
//		c = new Animal();	// 자손타입으로 조상객체 참조 불가능. error
		a.move();
		a.makeSound();
//		a.claw();	// 조상의 멤버만 사용가능. error
		
	}
}
