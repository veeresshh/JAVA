package Java;

import java.util.ArrayList;

public class CollectionArrayList {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();

// We can add duplicate values in list 
// You can access and insert any value in any index
//ArraList,LinkedList,vector- Implementing List interface //array have fixed size where as arraylist can grow dynamicaly 

		a.add("Veeresh");
		a.add("Dhanyatha");

// Add to Particular Index

		a.add(0, "Jyothi");

// Remove by Object Name

		a.remove("Dhanyatha");

// Remove Particular Index

		a.remove(1);

		System.out.println(a);

		System.out.println(a.get(0));

// To check whether testing is present or not

		System.out.println(a.contains("Testing"));

		System.out.println(a.contains("Jyothi"));

		System.out.println(a.indexOf("Jyothi"));

		System.out.println(a.size());

		System.out.println(a.isEmpty());

	}

}
