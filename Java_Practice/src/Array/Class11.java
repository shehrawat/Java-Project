package Array;

public class Class11 
{

	public static void main(String[] args) 
	{
		Display obj = new Display();
		obj.show(5);
		obj.show(4, 5);
	}

}

class Display
{
	
	public void show(int a)
	{
		System.out.println(a);
	}

	public void show(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);
	}


}
