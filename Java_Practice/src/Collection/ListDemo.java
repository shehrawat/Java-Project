package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListDemo {

	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<>();	// In list you can have duplicate value
		li.add(2);
		li.add(4);
		li.add(6);
		li.add(8);
		li.add(3);
		li.add(5);
		
		System.out.println(li);
		
		
		Set<Integer> s = new HashSet<>();		// In list you can not have duplicate value , every element in set will be unique
										// In Hashset when you print value it does not print values in sorted format
										// In Treeset when you print value it print values in sorted format
		s.add(2);
		s.add(6);
		s.add(3);
		s.add(4);
		s.add(5);
		
		System.out.println(s);
		
		Map<Integer, String> m = new HashMap<>();
		m.put(3,"Ajay");
		
		System.out.println(m);
	}

}
