package SuperKeyword;

public class Super3 {

	public static void main(String[] args) 
	{
		B3 obj = new B3();
		obj.abc();
	}

}

class A3		// By default every class extends Object class
{
	public void abc()
	{
		System.out.println("A3 class Abc");
	}
}

class B3 extends A3
{
	public void abc()
	{
		super.abc();
		System.out.println("B3 class Abc");
	}
}