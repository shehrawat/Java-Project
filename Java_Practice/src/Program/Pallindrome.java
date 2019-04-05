package Program;

public class Pallindrome 
{

	public static void main(String[] args) 
	{
		int n=123;
		int r;
		int s=0;
		int t=n;
		
		while(n>0)
		{
			r = n%10;
			n = n/10;
			s = s*10+r;
		}
		if(t==s)
		System.out.println("Number is Pallindrome : "+t);
		else
			System.out.println("Number is not Pllindrome : "+t);
	}

}
