package Constructor;

public class ABC 
{

	public static void main(String[] args) 
	{
		Xyz obj = new Xyz();
		Xyz obj1 = new Xyz(7);   // xyz() is a constructor
	
	}

}

class Xyz							// This is constructor overloading
{
	public Xyz()  //default constructor
	{
		System.out.println("Hello World");
	}
	
	public Xyz(int a)  //parameterized constructor
	{
		System.out.println("Hello World Para");
	}

}
