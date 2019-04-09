package String;

public class StringMutable 
{

	public static void main(String[] args) 
	{
		StringBuffer sbf = new StringBuffer("Ajay");
//		StringBuilder sbf = new StringBuilder("Ajay");	// Both are same but best is StringBuffer because StringBuffer are safe for use by multi threads.
														// And StringBuilder is not thread safe and no guarantee of synchronisation
		sbf.append(" Singh");
		sbf.replace(0, 4, "Abhi");
		sbf.delete(6, 9);
		System.out.println(sbf);
	}

}
