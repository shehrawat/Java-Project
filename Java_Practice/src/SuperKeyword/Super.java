package SuperKeyword;

public class Super 
{

	public static void main(String[] args) 
	{
//		A obj1 = new A();
		B obj2 = new B(7);
	}

}

class A		// By default every class extends Object class
{
	public A()
	{
		super();
		System.out.println("Class A");
	}
	
	public A(int i)
	{
		System.out.println("Para Class A");
	}
}

class B extends A
{
	public B()
	{
		super();
		System.out.println("Class B");		
	}
	
	public B(int i)
	{
		super(8);
		System.out.println("Para Class B");
	}
}