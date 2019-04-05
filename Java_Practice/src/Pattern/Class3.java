package Pattern;

public class Class3 
{

	public static void main(String[] args)
	{
		int i=1;
		int j=1;
		
		for(i=1;i<=4;i++)
		{
			
			for(j=1;j<=4;j++)
			{
				int k=i+j-1;
				
				if(k>4)
				System.out.print(k-4 +" ");
				else
					System.out.print(k+" ");
			}
			System.out.println("");
		}
	}

}
