package Java;

public class MultiDimensionalArray {

	public static void main(String[] args) {

// One Way of Declaring Multidimensional Array
		
		int a[][] = new int[2][3];
		
		a[0] [0] = 2;
		a[0] [1] = 4;
		a[0] [2] = 6;
		a[1] [0] = 8;
		a[1] [1] = 10;
		a[1] [2] = 12;
		
		System.out.println(a[1][0]);

// Another Way of Declaring Multidimensional Array

		int b[][] = {{2,4,6},{8,10,12}};
		
		System.out.println(b[1][2]);
		
		for(int i=0;i<2;i++) //row
		{

		for(int j=0;j<3;j++) //Column
		{
		System.out.println(a[i][j]);
		}
		
	    }

	}
}
