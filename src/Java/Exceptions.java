package Java;

public class Exceptions {

	int b = 5;
	int c = 0;
	
	public static void main(String[] args) {
		
		int b = 5;
		int c = 0;
		
// One Try can be followed by multiple catch block
// Catch should be immediate after try block
		
		try 
		{
			
// Arithmetic Exception
			
			int a = b/c;
			System.out.println(a);

// Index Out Of Bound Exception
			
			int arr[]=new int[5];
			System.out.println(arr[7]);
			
			
		}
		
		catch(ArithmeticException et)
		{
			System.out.println("Arithmetic Exception");
		}
		
		catch(IndexOutOfBoundsException ets)
		{
			System.out.println("Index Out Of Bounds Exception");
		}
		
		
		catch(Exception e)
		{
			System.out.println("Exception");
		}

// Finally Block - Can be executed without catch block and only with try block
		
		finally
		
		{
			// This block is executed irrespective of exception thrown or not
			// if we force stop jvm forcefully finally block will not be executed
			
			System.out.println("Finally Block");
		}

	}

}
