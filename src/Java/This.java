package Java;

public class This {

	int a = 2;

	public void GetData()

	{
		int a = 3;
		System.out.println(a); // we will get 3 [ Local Variable ]

		// But to get Class Object which is 2 [ Global Variable ] we use this keyword

		System.out.println(this.a);

		// To get sum of Local Variable and Global Variable

		int c = a + this.a;

		System.out.println(c);

	}

	public static void main(String[] args) {

		This T = new This();
		T.GetData();

	}

}
