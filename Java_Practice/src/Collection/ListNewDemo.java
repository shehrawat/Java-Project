package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListNewDemo 
{

	public static void main(String[] args)
	{
		List<Integer> values = new ArrayList<>();
		values.add(305);
		values.add(998);
		values.add(774);
		values.add(236);
		values.add(881);
		//values.add(4,881);	// Add value in position of index 1 i.e - add value between 98 and 87
		
		// Comparator Interface
		Comparator<Integer> com = (o1, o2) ->	// This is Lambda Expression
			{
				return o1%10>o2%10?1:-1; 
			};
		
		Collections.sort(values,com);	// This is used for sort the elements
		//Collections.reverse(values);
		
		
		// You can print the values using 1-
		
//		values.forEach(System.out::println);	// This is Stream API which uses Lambda expression
		
		// 2-
//		Iterator i = values.iterator();
		 
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}

		// 3-
		for(int obj : values)
		{
			System.out.println(obj);
		}
	}

}
