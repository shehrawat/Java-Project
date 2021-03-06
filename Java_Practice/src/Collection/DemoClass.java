package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoClass 
{

	public static void main(String[] args) 
	{
		
		Collection<Integer> values = new ArrayList<>();	// Collection maintain the sequence of insertion
		values.add(6);
		values.add(2);
		values.add(9);
		
		values.remove(2);
		
		// We can print values using Iterator and enhanced for loop
		
//		Iterator i = values.iterator();
//		
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		
		// Or
	
		for(Object obj : values)
		{
			System.out.println(obj);
		}
	}

}
