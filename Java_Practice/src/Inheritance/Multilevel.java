package Inheritance;

public class Multilevel {

	public static void main(String[] args) 
	{
		Multi obj = new Multi();
		obj.i = 6;
		obj.j = 5;
		
		obj.sum();
		System.out.println(obj.k);
		
		obj.sub();
		System.out.println(obj.k);
		
		obj.multi();
		System.out.println(obj.k);
		
	}

}

class Add1 
{
	int i,j,k;
	public void sum()
	{
		k = i+j;
	}
}

class Sub1 extends Add1
{
	public void sub()
	{
		k = i-j;
	}
}

class Multi extends Sub1
{
	public void multi()
	{
		k = i*j;
	}
}
