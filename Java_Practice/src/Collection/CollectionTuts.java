package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTuts 
{

	public static void main(String[] args) 
	{
		Collection<Integer> c = new ArrayList<>();	// It is Generics and Collection is an Interface and Collections is a class
															// Generics is used to specify the values
															// Collection does not work with index number but list is work with index number
															// ArrayList is a class which implements Collection indirectly
//		c.add("Ajay");
//		c.add("Singh");
		c.add(1);
		c.add(2);
//		c.add(5.5);
//		c.add('A');
		
		c.remove(2);
		
		for(Integer o : c)
		{
			System.out.println(o);
		}
		
	}

}

// Hierarchy of Collection
/* Collection - Interface
 * List - Interface
 * ArrayList - Class
 * */

// ArrayList implements List and List extends Collection

/* ArrayList follows the concept of Dynamic Array
 * - It shifts the whole values and index when we add or remove the value between the values 
 * - It takes too much time in insert or remove the values
 * - In searching or fetch the values it becomes fast because its working on index*/







/* LinkedList follows the concept of Double list 
 * - It shift only 2 nodes(Previous and Next) when we add or remove the value between the values 
 * - It takes less time
 * - In searching or fetch the values it becomes slow because it does not working on index*/
