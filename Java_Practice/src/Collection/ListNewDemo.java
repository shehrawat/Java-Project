package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListNewDemo 
{

	public static void main(String[] args) 
	{
		List<Integer> values = new ArrayList<>();
		values.add(2);
		values.add(4);
		values.add(5);
		values.add(1,3);	// Add value in position of index 1 i.e - add value between 2 and 3
		
		Collections.sort(values);	// This is used for sort the elements
		
		for(int i : values)
		{
			System.out.println(i);
		}
	}

}
