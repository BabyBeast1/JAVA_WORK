package examabstract;

abstract class Developer {

	abstract void coding();
	
}

class JavaDeveloper extends Developer {
	@Override
	void coding() {
		System.out.println("Coding by Java !");
	}
}

class CDeveloper extends Developer {
	@Override
	void coding() {
		System.out.println("Coding by C !");
	}
}

class PythonDeveloper extends Developer {
	@Override
	void coding() {
		System.out.println("Coding by Python !");
	}
}
public class Lab8_Developer {
	
	public static void main(String[] args) {
		
		Developer[] developer = {new JavaDeveloper(), new CDeveloper(), new PythonDeveloper()};
		for( int i = 0; i < developer.length; i++ ) {
			developer[i].coding();
		}
	}
}
