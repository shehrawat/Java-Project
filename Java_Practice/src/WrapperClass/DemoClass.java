package WrapperClass;

import java.util.ArrayList;

public class DemoClass 
{

	public static void main(String[] args) 
	{
		int i = 5;
		
		Integer ii = new Integer(i);	// Boxing
		Integer jj = i;					// Autooxing
		
		int j = jj.intValue();			// Unboxing
		int k = jj;						// AutoUnboxing
		
		System.out.println(j);
		
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(5);
		values.add(7);
		
		System.out.println(values);
	}

}
