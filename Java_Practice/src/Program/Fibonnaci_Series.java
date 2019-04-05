package Program;

public class Fibonnaci_Series 
{

	public static void main(String[] args) 
	{
		int a=1;
		int b=1;
		int c=0;
		System.out.print(a+" ");
		System.out.print(b+" ");
	
		while(c<50)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
