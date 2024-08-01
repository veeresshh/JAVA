package Java;

public class ForLoop {

	public static void main(String[] args) {
		
//Example 1 :
		
        int[] Array = new int[5];
		
		Array[0]=1;
		Array[1]=2;
		Array[2]=3;
		Array[3]=4;
		Array[4]=5;
		
		
		for( int i=0; i<Array.length; i++)
			
		{
			
		System.out.println((Array[i]));
		
		}

//Example 2 :
		
		int[] Array2 = {7,8,9,10,11};
		
        for( int i=0; i<Array2.length; i++)
			
		{
			
		System.out.println((Array2[i]));
		 
		}
				
			
				
//Example 3 :
        
		String[] Name = {"Veeresh", "Kumar", "S"};
		
		for( int i=0; i<Name.length; i++)
		
		{
				
	    System.out.println((Name[i]));
		
		}
		
//Enhanced For Loop :
		
        String[] Text = {"Simplify", "QA", "Test"};
		
		for( String T: Text)
		
		{
				
	    System.out.println((T));
		
		}
   }
	
}



