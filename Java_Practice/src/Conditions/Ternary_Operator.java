package Conditions;

public class Ternary_Operator 
{

	public static void main(String[] args) 
	{
//		int i = 1;
//		int j = 5;
//		-----------------------------------------------
//		if(i==1)
//			j = 6;
//			
//		else
//			j = 7;
//		
//		System.out.println(j);
//		------------------------------------------------
//		j = i==1? 6:7;			// Ternary Operator
//		System.out.println(j);
		
		Object obj1;
		Object obj2;
		
		if(true)
		{
			obj1 = new Integer(10);
		}
		else
		{
			obj1 = new Double(20.5);
		}
		
		System.out.println(obj1);
		
		obj2 = true? new Integer(10):new Double(20.5);		// Ternary Operator
		
		System.out.println(obj2);
		
		}
	

}
