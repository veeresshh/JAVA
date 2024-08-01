package Java;

public class Final {

	// If we mark class name as final we cannot extend the class

	final void GetData() {
		// This Method cannot be overridden
	}

	public static void main(String[] args) {

		final int i = 4;

		// i=5; This cannot be assigned because of final keyword in Previous line

		System.out.println(i);


	}

}
