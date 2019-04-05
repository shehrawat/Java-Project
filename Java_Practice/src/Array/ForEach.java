package Array;

public class ForEach 
{

	public static void main(String[] args) 
	{
		int ar[] = new int[8];
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = i+1;
		}
		for(int j : ar)
			System.out.println(j);
	}

}
