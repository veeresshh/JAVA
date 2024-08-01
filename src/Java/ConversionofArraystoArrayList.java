package Java;

import java.util.Arrays;
import java.util.List;

public class ConversionofArraystoArrayList {

	public static void main(String[] args) {

		String[] name = { "Veeresh", "Kumar", "S" };
		List<String> ArrayList = Arrays.asList(name);

		System.out.println(ArrayList.contains("Kumar"));

	}

}
