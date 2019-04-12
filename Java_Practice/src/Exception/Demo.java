package Exception;

public class Demo 
{

	public static void main(String[] args) 
	{
		int i,j,k=0;
		i = 8;
		j = 0;
		
		try
		{
			k = i/j;
		}
		catch(ArithmeticException e)
		{
//			System.out.println(e);
			System.out.println("Cannot devide by Zero "+ e);
		}
		System.out.println(k);
		
	}

}

// Hierarchy of Exception   - In this all data fetch from javadox

/*Throwable
 *		  - Exception		// Exception extends Throwable
 *					- Checked
 *						-IOException
 *						-SQLException
 *
 * 					- Unchecked
 * 						-RunTimeException		// RunTimeException extends Exception
 * 									- ArithmeticException			*/  // ArithmeticException extends RunTimeException
 