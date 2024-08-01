package Java;

import java.util.ArrayList;

public class IteratingArrayAndArrayList {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();

		a.add("Veeresh");
		a.add("Kumar");
		a.add("Simplify");

//For Loop

		for (int i = 0; i < a.size(); i++)

		{

			System.out.println(a.get(i));

		}

//Enhanced For Loop			

		for (String Value : a)

		{

			System.out.println(Value);

		}

//Contains

		System.out.println(a.contains("Simplify"));

	}

}
