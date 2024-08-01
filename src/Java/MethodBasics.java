package Java;

public class MethodBasics {

	public static void main(String[] args) {

		MethodBasics MB = new MethodBasics();
		String Name = MB.GetData();

		System.out.println(Name);

// Calling Directly without creating Object because we have used static keyword

		GetUserData();

	}

	public String GetData()

	{
		System.out.println("Hello");
		return "Veeresh";
	}

// Use Static Keyword to call method without creating object inside the class

	public static void GetUserData() {
		System.out.println("Bye");

	}

}
