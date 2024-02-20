package examList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab12_AnimalArrayList {

	public static void main(String[] args) {
		
	List<String> animal = new ArrayList<>();
	
	animal.add("Tiger");
	animal.add("Dog");
	animal.add("Cat");
	animal.add("Bear");
	animal.add("Monkey");
	
	animal.set(1, "Lion");
	
	animal.remove(4);
	

	for(int i=0; i < animal.size(); i++ ) {
		
		String animal1 = animal.get(i);
		
		System.out.print(animal1 + ", ");
	}
	
		System.out.println("");
		
		
	Iterator<String> animal2 = animal.iterator();
	
	while(animal2.hasNext()) {
		System.out.println(animal2.next());
		
	}
	
	}
}
