package Exception;

public class ArrayIndexOutOfBound 
{

	public static void main(String[] args) 
	{
		int ar[] = new int[4];
		
		try
		{
		for(int i=0;i<=4;i++)
		{
			ar[i] = i+1;
		}
		
		for(int value : ar)
		{
			System.out.println(value);
		}
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}

}
