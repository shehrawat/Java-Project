package Interface;

interface Abcd
{
	void show();	// This is abstract method because we cannot define it
}

interface Yyy
{
	default void aaa()	// we can define a method in interface using default keyword
	{
		
	}
}

interface Pqrs extends Abcd, Yyy 	// You can extend more than 1 interface in java 1.8
{
	
}

public class LambdaExpression
{
	public static void main(String[] args) 
	{
		Abcd obj = () -> System.out.println("This is Show");
		
		obj.show();
	}

}
