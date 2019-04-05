package Conditions;

public class If_Else 
{

	public static void main(String[] args) 
	{
		int a = 6;
		int b = 4;
		int c = 8;
		
		if(a%2==0)
		{
			System.out.println("Even");
		}
		
		else
		{
			System.out.println("Odd");
		}
		
		if(a>b && a>c)                               // a b ->  && | ||
		{											 // T T ->  T  | T
			System.out.println("A is greater");		 // T F ->  F  | F
		}											 // F T ->  F  | F
													 // F F ->  F  | F
		else if(b>c)
		{
			System.out.println("B is Greater");
		}
		
		else
		{
			System.out.println("C is greater");
		}
	}

}
