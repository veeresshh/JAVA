package Java;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();

//Add	
		a.add("Veeresh");
		a.add("Kumar");
		a.add("Simplify");

		System.out.println(a);

//Remove

		a.remove(2);

		System.out.println(a);

//Extract	

		System.out.println(a.get(0));

	}

}
