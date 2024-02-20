package examinterface;

// 리모콘 인터페이스 선언
interface RemoteControl{
	public abstract void turnOn();	// 추상메소드 선언
	void turnOff();		// public abstract 생략
	static void batteryWarning() {}	// static 메소드 선언
}

// 리모콘을 구현한 Tv 클래스 선언
class Tv implements RemoteControl{
	int channel;	// Tv의 필드
	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
	}
	
	// Tv의 메소드
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}

// 리모콘을 구현한 Audio 클래스 선언
class Audio implements RemoteControl{
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
}

// 리모콘을 구현한 LaundryMachin 클래스 선언
class LaundryMachin implements RemoteControl{
	@Override
	public void turnOn() {
		System.out.println("LaundryMachin을 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("LaundryMachin을 끕니다.");
	}
}

public class Ex8_RemoteControl {

	public static void main(String[] args) {
//		RemoteControl rc = new RemoteControl() ;	// error
		// 리모콘타입의 참조변수 선언은 가능
		RemoteControl rc = new Tv();	// 리모콘에 있는 기능만 사용가능
		rc.turnOn();
		rc.turnOff();
//		rc.channelUp;	// error
//		rc.channelDown;	// error
		
		Tv t = new Tv();	// Tv에 있는 모든 멤버 사용가능
		t.channelDown();
		t.channelUp();
		t.turnOn();
		t.turnOff();
	}
}
