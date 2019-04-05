package Array;

public class Class22 
{
	public void abc(int ... a)    // varargs - variable argument
	{
		for(int i : a)
		{
		System.out.println(i);
	
		}
	}
	
	public void abc(int a)
	{
		System.out.println(a + " : Its show a");
	}

	public static void main(String[] args) 
	{
		Class22 obj = new Class22();
		obj.abc(2);

	}

}
