package String;

public class StringSplitToCSV 
{

	public static void main(String[] args) 
	{
		String str = " Ajay, Abhishek, Roshan, Bhavya, Saanu ";	// Here String str is immutable, ypu cannot change the values
		
		String names[] = str.split(",");
		
		for(String val : names)
		{
			System.out.println(val);
		}
	}

}
