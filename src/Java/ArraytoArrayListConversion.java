package Java;


import java.util.Arrays;
import java.util.List;

public class ArraytoArrayListConversion {

	public static void main(String[] args) {
		
		String[] Name = {"Veeresh", "Kumar", "S"};
		List<String> Arraylist = Arrays.asList(Name);
		System.out.println(Arraylist.contains("Kumar"));

	}

}
