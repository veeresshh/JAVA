package Java;

public class ChildSuperClass extends ParentSuperClass {

//Strings
	String Name = "Dhanyatha";

	public void GetString()

	{
		// Usually Child class variable will be preferred

		System.out.println(Name);

		// To Bring Name in Parent Class we use super class when same keyword is used

		System.out.println(super.Name);
	}

//Methods

	public void GetData()

	{
		super.GetData();
		System.out.println("I am Child Class");
	}

//Constructor

	public ChildSuperClass()

	{
		super(); // This should always be in first line
		System.out.println("I am Child Constructor");
	}

	public static void main(String[] args) {

		ChildSuperClass CS = new ChildSuperClass();

		CS.GetString();

		CS.GetData();

	}

}
