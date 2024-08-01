package Java;

public class PyramidTriangle {

	public static void main(String[] args) {

// Ulta Pyramid

		int k = 1;

		for (int i = 0; i <= 4; i++)

		{

			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(k);
				System.out.print("\t"); // To Give space between Numbers
				k++;
			}
			System.out.println(""); // To go to new Line
		}

// Straight Pyramid		
		

		int a = 3;

		for (int b = 1; b <= 4; b++)

		{

			for (int c = 1; c <= b; c++) {
				System.out.print(a);
				System.out.print("\t"); // To Give space between Numbers
				a += 3;
			}
			System.out.println(""); // To go to new Line
		}

	}

}
