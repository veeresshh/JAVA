package Java;

public class PrintLargestNumberinMatrix {

	public static void main(String[] args) {
		
        int abc[][] = {{12,4,5},{3,20,7},{8,11,9}};
		
		int max = abc[0][0];
		
		for(int i=0;i<3;i++) 
			
		{

		for(int j=0;j<3;j++) 
			
		{
		
			if(abc[i][j]>max)
				
			{
				
				max = abc[i][j];
				
			}
			
		}
			
		}
			
	         System.out.println(max);


	}

}
