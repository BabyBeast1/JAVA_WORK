package exam;

interface Playable {
	void play();	// 추상메소드
}

class Piano implements Playable {
	@Override
	public void play() {
		System.out.println("Play with piano");
	}
}

class Guiter implements Playable {
	@Override
	public void play() {
		System.out.println("play with guiter");
	}
}

class Person {}

// 제네릭 클래스 선언
// T는 Playable을 구현한 클래스만 올 수 있다.
class MusicBox <T extends Playable> {
	T instrument;
	void set(T instrument) {
		this.instrument = instrument;
	}
	void playMusic() {
		// Playable로 제한했기 때문에 play()메소드 사용 가능
		instrument.play();
	}
}
public class Ex11_BoundedInterface {

	public static void main(String[] args) {
		MusicBox<Playable> mbox = new MusicBox<>();
		mbox.set(new Piano());
		mbox.playMusic();
		
		mbox.set(new Guiter());
		mbox.playMusic();
		
//		MusicBox<Person> pbox = new MusicBox<>();	// Person은 Playable을 구현하지 않았기 때문에 안된다.
		
	}
}
