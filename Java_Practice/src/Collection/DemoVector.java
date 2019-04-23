package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class DemoVector 
{
	// Vector is same as ArrayList, Vector is dynamic Array

	public static void main(String[] args) 
	{
		
		ArrayList<Integer> v = new ArrayList<>();	// 50% -  ArrayList save the memory | It is Not ThreadSafe | Fast
		
		System.out.println(v.size());
//		Vector v = new Vector<>();	// 100% -  If you exceed the limit it will increase the capacity -> Vector waste the memory | It is ThreadSafe | Slow
//		v.add(9);
//		v.add(14);
//		v.add(8);
//		
//		v.remove(1);
//		
//		System.out.println(v.capacity());	// By default Array capacity is 10
//		//Collections.sort(v);
//		
//		for (Object obj : v)
//		{
//			System.out.println(obj);
//		}
	}

}
