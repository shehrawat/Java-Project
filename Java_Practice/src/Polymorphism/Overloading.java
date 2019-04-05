package Polymorphism;

public class Overloading // Method overloading , Early Binding , Static Binding , Compile Time Polymorphism
{
	public void show()
	{
		System.out.println("This is show");
	}
	
	public void show(int i)
	{
		System.out.println("This is show Integer");
	}

	public static void main(String[] args) 
	{
		Overloading obj = new Overloading();
		obj.show(6);
	}

}

