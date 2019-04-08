package WrapperClass;

public class Wrapper 
{

	public static void main(String[] args) 
	{
		int i = 5;
		Integer iobj = new Integer(i);	// This Integer class is a Wrapper class and new Integer(i) is known as wrapping
		System.out.println(iobj);
		
		int j = iobj.intValue();	// This is unwrapping
		System.out.println(j);
		
	}

}
