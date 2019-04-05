package Array;

public class Array2d 
{

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4};
		int b[] = {5,6,7,8};
		int c[] = {9,8,4,2};
		
//		int ar[][] = new int [3][4];
//		ar[0][0] = 1;
//		ar[0][1] = 1;
//		ar[0][2] = 1;
//		ar[0][3] = 1;
//		ar[1][0] = 1;
//		ar[1][1] = 1;
//		ar[1][2] = 1;
//		ar[1][3] = 1;
//		ar[1][0] = 1;
//		ar[3][1] = 1;
//		ar[3][2] = 1;
//		ar[3][3] = 1;
		
//		Or
		
		int ar[][] = {{1,2,3,4},{5,6,7,8},{9,8,4,2}};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(ar[i][j]+ " ");
			}
			System.out.println("");
		}
	}
}


