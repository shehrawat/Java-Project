package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyBlockDemo 
{

	public static void main(String[] args)
	{
		int i,j=1,k=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		i = 8;
		
		
		try
		{
			System.out.println("Enter a Number : ");
			j = Integer.parseInt(br.readLine());
			k = i/j;
			System.out.println("Output is : "+k);
			
		}
		catch(IOException e1)
		{
			System.out.println("Some IO error ");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannoy devide by zero " +e);
		}
		catch(Exception e)
		{
			System.out.println("Unknown Exception : "+e);
		}
		finally
		{
			System.out.println("Finally Bye");
		}
		
	}

}
