package Inheritance;

public class SinghLevel {

	public static void main(String[] args) 
	{
		Add obj = new Add();
		obj.i = 6;
		obj.j = 5;
		obj.sum();
		System.out.println(obj.k);
		obj.sub();
		System.out.println(obj.k);
	}

}

class Add extends Sub
{

	public void sum()
	{
		k = i+j;
	}
}

class Sub
{
	int i,j,k;
	public void sub()
	{
		k = i-j;
	}
}
