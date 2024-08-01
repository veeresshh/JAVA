package Java;

public class SingleDimensionalArray {

	public static void main(String[] args) {

// One Way of Declaring Array

		int a[] = new int[5];

		a[0] = 2;
		a[1] = 4;
		a[2] = 6;
		a[3] = 8;
		a[4] = 10;

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);

		}
//Giving Space

		System.out.println("\t");

// Another Way of Declaring Array

		int b[] = { 1, 3, 5, 7, 9 };

		for (int i = 0; i < a.length; i++) {

			System.out.println(b[i]);

		}

	}

}
