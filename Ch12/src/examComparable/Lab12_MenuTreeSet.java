package examComparable;

import java.util.TreeSet;

class Menu implements Comparable<Menu> {
	String food;
	int price;
	Menu (String food, int price) {
		this.food = food;
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return food + " " + price;
	}
	
	@Override
	public int compareTo(Menu o) {
		if ( price < o.price ) return -1;
		else if( price > o.price ) return 1;
		else {
			return food.compareTo(o.food);
		}
	}
}

public class Lab12_MenuTreeSet {

	public static void main(String[] args) {
		
		TreeSet<Menu> set = new TreeSet<>();
		Menu m1 = new Menu("떡볶이", 3000);
		Menu m2 = new Menu("순대", 2500);
		Menu m3 = new Menu("김밥", 3500);
		Menu m4 = new Menu("라면", 3500);
		set.add(m1);
		set.add(m2);
		set.add(m3);
		set.add(m4);
		System.out.println(set);
	}
}
