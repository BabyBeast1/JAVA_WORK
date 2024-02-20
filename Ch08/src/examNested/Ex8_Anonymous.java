package examNested;

// 인터페이스 선언
interface RemoteControl{
	void turnOn();		// 추상메소드 선언
	void turnOff();
}

//class Tv implements RemoteControl {
//	@Override
//	public void turnOff() {
//		System.out.println("Tv를 끕니다.");	
//	}
//	@Override
//	public void turnOn() {
//		System.out.println("Tv를 켭니다.");
//	}
//}

class AnonymousClass {
	RemoteControl rc = new RemoteControl() {
		
		@Override
		public void turnOff() {
			System.out.println("Audio를 끕니다.");	
		}
		
		@Override
		public void turnOn() {
			System.out.println("Audio를 켭니다.");
		}
		
	};	// 필드 선언.
	void method(RemoteControl rc) {	// 메소드 선언
		rc.turnOn();
	}
}
public class Ex8_Anonymous {

	public static void main(String[] args) {
		
		AnonymousClass anony = new AnonymousClass();
		anony.method(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");	
			}
		});
	}
}
