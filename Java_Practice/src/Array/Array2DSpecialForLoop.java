package Array;

public class Array2DSpecialForLoop 
{

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4};
		int b[] = {5,6,7,8};
		int c[] = {9,8,4,2};
		
		int ar[][] = {{1,2,3,4},{5,6,7,8},{9,8,4,2}};
		
		for(int i[] : ar)
		{
			for(int j : i)
			{
			System.out.print(j+ " ");
			}
			System.out.println("");
		}
		
	}

}
