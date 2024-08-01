package Java;

public class FunctionOverloading {

	// Either Argument Count Should be Different
	// Either Argument Data Type should be Diferent

	public void Overloading(int a) {

		System.out.println(a);
	}

	public void Overloading(String a) {

		System.out.println(a);
	}

	public void Overloading(int a, int b) {

		System.out.println(b);
	}

	public static void main(String[] args) {

		FunctionOverloading FO = new FunctionOverloading();
		FO.Overloading(2);
		FO.Overloading("Veeresh");
		FO.Overloading(3, 5);

	}

}
