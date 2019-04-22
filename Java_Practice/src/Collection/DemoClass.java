package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoClass 
{

	public static void main(String[] args) 
	{
		
		Collection values = new ArrayList<>();	// Collection maintain the sequence of incertion
		values.add(6);
		values.add("Ajay");
		values.add(2);
		values.add(6.5);
		
		// We can print values using Iterator and enhanced for loop
		
		Iterator i = values.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		// Or
	
//		for(Object obj : values)
//		{
//			System.out.println(obj);
//		}
	}

}
