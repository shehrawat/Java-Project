package Program;

public class Prime 
{

	public static void main(String[] args) 
	{
		int num = 28;
		boolean isPrime = true;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			isPrime = false;
		}
		
		if(isPrime)
		{
			System.out.println(num +" : Number is prime");
		}
		else
		{
			System.out.println(num +" : Number is not prime");
		}
	}

}
