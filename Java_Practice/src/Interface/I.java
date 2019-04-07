package Interface;

interface I 
{
	
	default void show()
	{
		System.out.println("I");
	}
	
	static void display()
	{
		System.out.println("Display");
	}
}

