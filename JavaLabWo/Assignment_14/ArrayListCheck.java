package Assignment_14;

import java.util.ArrayList;

public class ArrayListCheck {

	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Apple");
		a1.add("Banana");
		a1.add("Grapes");
		a1.add("Mango");
		a1.add("Orange");
		
		ArrayList<String> a2 = new ArrayList<String>();
		
		a2.add("Grapes");
		a2.add("Mango");
		a2.add("Orange");
		
		System.out.println("First ArrayList contains all the elements of Second ArrayList : " +a1.containsAll(a2));

	}

}
