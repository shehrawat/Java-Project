package Practice;

public class StaticBlock 
{
	static String s = "";
	static
	{
		s = "Hello World";
	}
	
	static
	{
		System.out.println("Hello 2");
	}

	public static void main(String[] args) 
	{
		System.out.println("Value of S is : "+s);
	}

}
