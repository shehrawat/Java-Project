package SystemReadIn;

public class UserInput 
{

	public static void main(String[] args) throws Exception
	{
		int i = System.in.read();	// It taking the input and the ASCII value and then convert it into integer value
		System.out.println((char)i);	// This is type casting
	}

}