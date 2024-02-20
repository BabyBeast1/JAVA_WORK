package examinterface;

// Mp3Interface를 구현한 스마트폰과 컴퓨터 클래스 선언하고 사용해보기
class SmartPhone implements Mp3Interface {
	// field 선언
	private int volume;	// 볼륨
	
	@Override
	public void play() {
		System.out.println("스마트폰에서 음악을 재생합니다.");	
	}
	@Override
	public void stop() {
		System.out.println("스마트폰에서 음악을 중지합니다.");
	}
	@Override
	public void volumeUp() {
		volume += 3;	// 3씩증가
		if( volume < Mp3Interface.MAX_VOLUME ) {
			volume = Mp3Interface.MAX_VOLUME;	// 최대 볼륨으로.
		}		
		System.out.println("현재 볼륨 : " + volume);
	}
	@Override
	public void volumeDowm() {
		volume -= 3;	// 3씩감소
		if( volume < Mp3Interface.MIN_VOLUME ) {
			volume = Mp3Interface.MIN_VOLUME;	// 최소 볼륨으로.
		}
		System.out.println("현재 볼륨 : " + volume);
		
	}
	
}

class Computer implements Mp3Interface {
	// field 선언
	private int volume;	// 볼륨
	
	@Override
	public void play() {
		System.out.println("컴퓨터에서 음악을 재생합니다.");	
	}
	@Override
	public void stop() {
		System.out.println("컴퓨터에서 음악을 중지합니다.");
	}
	@Override
	public void volumeUp() {
		volume += 5;	// 5씩증가
		if( volume < Mp3Interface.MAX_VOLUME ) {
			volume = Mp3Interface.MAX_VOLUME;	// 최대 볼륨으로.
		}		
		System.out.println("현재 볼륨 : " + volume);
	}
	@Override
	public void volumeDowm() {
		volume -= 5;	// 5씩감소
		if( volume < Mp3Interface.MIN_VOLUME ) {
			volume = Mp3Interface.MIN_VOLUME;	// 최소 볼륨으로.
		}
		System.out.println("현재 볼륨 : " + volume);
		
	}
	
}

public class Ex8_MusicPlayer {

	// 인터페이스 타입은 반환타입이 될 수 있다.
	static Mp3Interface player() {
		return new SmartPhone();
	}
	// 인터페이스 타입은 메소드의 매개변수가 될 수 있다.
	// mp는 Mp3Interface를 구현한 클래스의 객체를 받을 수 있다.
	static void playMusic(Mp3Interface mp) {
		mp.play();
		mp.volumeUp();
		mp.volumeUp();
		mp.volumeUp();
	}
	public static void main(String[] args) {
		Computer c = new Computer();
		SmartPhone sp = new SmartPhone();
		playMusic(sp);
		
		Mp3Interface p = player();	// player가 반환하는 객체를 참조하기 위해 인터페이스타입의 참조변수 선언
		p.play();	// SmartPhone이 될 수도 있고, Computer가 될 수 도 있다.
	}
}
