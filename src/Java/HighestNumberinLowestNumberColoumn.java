package Java;

public class HighestNumberinLowestNumberColoumn {

	public static void main(String[] args) {


        int abc[][] = {{2,4,5},{3,0,7},{1,2,9}};
		
		int min = abc[0][0];
		int mincoloumn = 0;
		
		for(int i=0;i<3;i++) 
			
		{

		for(int j=0;j<3;j++) 
			
		{
		
			if(abc[i][j]<min)
				
			{
				
				min = abc[i][j];
				mincoloumn = j;
				
			}
			
		}
			
		}
		    
		    int max = abc[0][mincoloumn];
			int k = 0;
			
			while(k<3)
			
			{
				
				if(abc[k][mincoloumn]>max)
				{
					max = abc[k][mincoloumn];
					
				}
				
				    k++;
			}
	        
            System.out.println(max);

	}

}
