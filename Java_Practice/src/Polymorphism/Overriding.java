package Polymorphism;

public class Overriding 	// Method overriding , Late Binding , Dynamic Binding , Runtime Polymorphism
{

	public static void main(String[] args) 
	{
		A obj1 = new A();
		B obj2 = new B();
		
		A a;
		a = obj1;		// Dynamic Method Dispatch | Run Time Polymorphism
		a = obj2;		// Dynamic Method Dispatch | Run Time Polymorphism
		a.display();
	}

}

class A		// Super Class
{
	public void display()
	{
		System.out.println("This is Display A");
	}
}

class B extends A	// Sub Class
{
	public void display()
	{
		System.out.println("This is Display B");
	}
}
