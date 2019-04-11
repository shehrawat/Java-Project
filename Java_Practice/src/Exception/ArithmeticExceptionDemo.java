package Exception;

public class ArithmeticExceptionDemo 
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
			System.out.println("Cannoy devide by zero " +e);
		}
		System.out.println(k);
	}

}

//Hierarchy of Exception
  
// 	- Exception
//			- Checked
//					- IOException
//					- SQLException
			
//			- Unchecked
//					- RuntimeException
//									- Arithmetic Exception
//									- ArrayIndexOutOfBoundException
//
