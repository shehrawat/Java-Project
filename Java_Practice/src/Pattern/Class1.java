package Pattern;

public class Class1 
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=4;i++)				
		{
			for(int j=1;j<=4;j++)
			{
				if(i==1||i==4||j==1||j==4)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		
		/*for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}*/
	}

}
