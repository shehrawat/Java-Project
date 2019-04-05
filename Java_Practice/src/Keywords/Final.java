package Keywords;

public class Final 
{
	// Final : we can use Final with variable, Method, Class

	public static void main(String[] args) 
	{
		final int i;
		i = 5;
//		i = 7;	//It gives error because we can not assign a value after use final keyword for the variable
		System.out.println(i);
		
		Bc obj = new Bc();
		obj.show();
	}
}

class Ab
{
	final public void show()
	{
		System.out.println("In Ab show");
	}
}

class Bc extends Ab
{
//	public void show()		// It gives error here because we can not override a method after use final keyword for the method
	{
		System.out.println("In Bc show");
	}
}

final class D
{
	
//	}

// class E extends D		// It gives error here because we can not inherit a class after use final keyword for the class
{
	
}

}
