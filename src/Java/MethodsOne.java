package Java;

public class MethodsOne {

	public static void main(String[] args) {

		MethodsOne M = new MethodsOne();
		String N = M.GetData();
		System.out.println(N);

//Calling Methods From Different Class

		MethodsTwo M2 = new MethodsTwo();
		M2.GetUserData();

	}

	public String GetData()

	{
		System.out.println("Hello");
		return "Veeresh";

	}
}
