package Keywords;

public class This 
{

	public static void main(String[] args) 
	{
		A obj = new A(6);
		obj.show(); 
	}

}

class A
{
	private int x;	// Instance variable
	public A(int x) // Local Variable
	{
		this.x = x;		// Current instance
	}
	
	public void show()
	{
		System.out.println("X is"+ x);
	}
}
