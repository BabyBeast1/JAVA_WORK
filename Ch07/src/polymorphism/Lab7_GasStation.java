package polymorphism;

class MyCar {
	void putGas() {
		System.out.println("차에 연료를 채웁니다.");
	}
}

class SUV extends MyCar {
	@Override
	void putGas() {
		System.out.println("SUV에 연료를 채웁니다.");
	}
}

class Sedan extends MyCar {
	@Override
	void putGas() {
		System.out.println("Sedan에 연료를 채웁니다.");
	}
}

class Van extends MyCar {
	@Override
	void putGas() {
		System.out.println("Van에 연료를 채웁니다.");
	}
}

class GasStation {
	void fill(MyCar car){
		car.putGas();
	}
}
public class Lab7_GasStation {

	public static void main(String[] args) {
		GasStation gs = new GasStation();
		gs.fill(new Van());
		gs.fill(new SUV());
		gs.fill(new Sedan());
	}
}
