package examinterface;

/* 음악을 들을 수 있는 Mp3 기능을 정의한 인터페이스 */

public interface Mp3Interface {

	// 상수 정의
	int MAX_VOLUME = 20;
	int MIN_VOLUME = 0;
	
	// 추상 메소드 정의(기능 정의)
	void play();	// 음악 재생
	void stop();	// 재생 멈춤
	public abstract void volumeUp();		// 소리 키워
	public abstract void volumeDowm();		// 소리 줄임
	
}
