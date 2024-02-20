package modifier;

class Car {
	private int gas;

	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		if ( 0 <= gas && gas <= 100) {
			this.gas = gas;
		}else if ( 0 > gas ) {
			this.gas = 0;
		}else {
			this.gas = 100;
		}
	}
	
	
}

public class Lab7_CarCapsule {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.setGas(50);
		System.out.println("연료량: " + c.getGas());
		c.setGas(-1);
		System.out.println("연료량: " + c.getGas());
		c.setGas(1000);
		System.out.println("연료량: " + c.getGas());
	}
}
