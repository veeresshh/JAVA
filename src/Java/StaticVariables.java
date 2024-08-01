package Java;

public class StaticVariables {
	
// Instance Variables
	
	String Name;
	String Address;
	
// Class Variables - which dont Change
	
	static String City = "Bangalore";
	
	static int i =0;
	
// Assigning value to static variables in block
		
	static int Pincode;
	
	static
	
	{
		Pincode =560056;
	}
	

// Local Variables
	
	StaticVariables(String Name, String Address)
	
	{

//Sending from Local to Instance Variables
		
		this.Name=Name;
		this.Address=Address;
		
		i++;
		
		System.out.println(i);
		
		System.out.println(Pincode);
			
	}
	
	

	public void GetAddress()
	
	{
		System.out.println(Address+" "+City);
	}

//Static Methods can only use static variables
	
	public static void GetCity()
	
	{
		System.out.println(City);
	}
	
	
	public static void main(String[] args) {
		
		StaticVariables SV1 =new StaticVariables("Veeresh","Nagarbhavi");
		StaticVariables SV2 =new StaticVariables("Dhanyatha","Vijaynagar");
		
		SV1.GetAddress();
		SV2.GetAddress();

// We can call static method by using Class not by object
		
		StaticVariables.GetCity();
		StaticVariables.GetCity();
		
// Assigning values to static variable		
		StaticVariables.i=4;
		
// Assigning values to Non static variable	
		SV1.Address="Rajajinagar";

	}

}
