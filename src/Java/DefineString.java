package Java;

public class DefineString {

	public static void main(String[] args) {
	
		
// First Type [ Literal ]
		
		String S1 = "SimplifyQA";
		System.out.println(S1);
		
		
// Second Type [ New Memory Allocation ]
		
		String S2 = new String ("Simplify3x");
		System.out.println(S2);
		
// Split String
		
		String S = "Veeresh Kumar Shiva Kumar";
		
		String[] SplittedString = S.split(" ");
		
		System.out.println(SplittedString[0]);
		System.out.println(SplittedString[1]);
		System.out.println(SplittedString[2]);
		System.out.println(SplittedString[3]);
		
		
//Trim String	
		
		String ST = "Veeresh Kumar Shiva Kumar";
		
		String[] SplittedStrings = ST.split("Kumar");
		
		System.out.println(SplittedStrings[0]);
		System.out.println(SplittedStrings[1]);
		System.out.println(SplittedStrings[1].trim());
		
		
//Print by Character - Forward
		
		String SPF = "Veeresh Kumar Shiva Kumar";
		for(int i=0; i<SPF.length(); i++)
		{
			System.out.println(SPF.charAt(i));
		}
		
//Print by Character - Backward
		
		String SPB = "Veeresh Kumar Shiva Kumar";
		for(int i=SPB.length()-1; i>=0; i--)
		{
			System.out.println(SPB.charAt(i));
		}
		
		
		
	}

}
