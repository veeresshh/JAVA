package Java;

public class ConditionalStatements {

	public static void main(String[] args) {

//Numbers Divided by 2

//If Condition

		int[] Array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 120 };

		for (int i = 0; i < Array.length; i++)

		{
			if (Array[i] % 2 == 0)

				System.out.println(Array[i]);

		}

//If Else Condition

		int[] Number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 120 };

		for (int i = 0; i < Number.length; i++)

		{
			if (Number[i] % 2 == 0)

			{

				System.out.println(Number[i] + " is Multiple of 2");
				break;

			}

			else

			{

				System.out.println(Number[i] + " is Not Mutile of 2");

			}

		}

	}

}
