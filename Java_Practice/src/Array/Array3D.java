package Array;

public class Array3D 
{

	public static void main(String[] args)
	{
		int ar[][][] = new int [4][4][4];
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<4;k++)
				{
					ar[i][j][k] = i+j+k;
				}
			}
		}
		
		for(int i[][] : ar)
		{
			for(int j[] : i)
			{
				for(int k : j)
				{
					System.out.print(" "+k);
				}
				System.out.println("");
			}
		}
	}

}
