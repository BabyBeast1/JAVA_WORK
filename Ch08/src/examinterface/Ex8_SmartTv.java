package examinterface;

// RemoteControl과 InternetSearchable 인터페이스를 다중구현하는 클래스 정의
class SmartTv implements RemoteControl, InternetSearchable {
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("SmartTv를 끕니다.");
	}
	@Override
	public void turnOn() {
		System.out.println("SmartTv를 켭니다.");
	}
	
}
public class Ex8_SmartTv {

	public static void main(String[] args) {
		
		RemoteControl rc = new SmartTv();
		rc.turnOn();
		rc.turnOff();
//		rc.search("www.pitca.co.kr");	// error. 리모콘에 있는 멤버만 쓸수 있음.
		
		// 인터넷검색기능을 위해선 InternetSearchable 인터페이스 타입으로 참조하거나
		// SmartTv 타입으로 참조해야만 한다.
		InternetSearchable srch = new SmartTv();
		srch.search("www.pitca.co.kr");
		
		SmartTv st = new SmartTv();
		st.turnOn();
		st.turnOff();
		st.search("www.naver.com");
	}
}
