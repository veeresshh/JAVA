package Java;

public class PrintNameinReverse {

	public static void main(String[] args) {
		
//Reverse
		
		String s = "Veeresh Kumar";
		
		for(int i=s.length()-1 ; i>=0 ; i--)
			
		{
			System.out.println(s.charAt(i));
		}

		System.out.println("......................");
		
//Straight
		
		String sa = "Veeresh Kumar";
		
		for(int i=0 ; i<sa.length() ; i++)
			
		{
			System.out.println(sa.charAt(i));
		}

	}

}
