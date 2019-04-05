package Array;

import java.util.Random;

public class RandomPrint 
{

	public static void main(String[] args) 
	{
		Random rd = new Random();
		int a[] = new int[20];
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = rd.nextInt(50);
		}
		for(int i : a)
		{
			System.out.println(i);
		}

	}

}
