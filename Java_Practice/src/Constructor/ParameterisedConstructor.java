package Constructor;

public class ParameterisedConstructor 
{

	public static void main(String[] args) 
	{
		Cns obj = new Cns(5.6);		// insert blank, 5, 5.6
	}

}

class Cns
{
	
	public Cns()
	{
		System.out.println("Default Constructor");
	} 
	
	public Cns(int a)
	{
		System.out.println("Integer Constructor");
	}
	
	public Cns(double b)
	{
		System.out.println("Double Constructor");
	}

}
