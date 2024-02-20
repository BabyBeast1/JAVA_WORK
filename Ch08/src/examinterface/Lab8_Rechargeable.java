package examinterface;

class SmartPhone2 implements Rechargeable{
	@Override
	public void recharge() {
		System.out.println("스마트폰을 충전합니다.");
	}
}

class DigitalCamera implements Rechargeable{
	@Override
	public void recharge() {
		System.out.println("카메라를 충전합니다.");
	}
}
public class Lab8_Rechargeable {

	static void connect(Rechargeable r) {
		r.recharge();
	}
	
	public static void main(String[] args) {
		
		connect(new SmartPhone2());
		connect(new DigitalCamera());
		
	}
}
