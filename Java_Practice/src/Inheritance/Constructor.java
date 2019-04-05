package Inheritance;

public class Constructor {

	public static void main(String[] args) 
	{

		BB obj = new BB();
//		AA obj = new BB();   // Case C
	}

}

class AA
{
	public AA()
	{
		System.out.println("Constructor A");
	}
	
	public AA(int i)
	{
		System.out.println("Integer Constructor A");
	}
}

class BB extends AA
{
	public BB()
	{
		System.out.println("Constructor B");
	}
	
	public BB(int j)
	{
		System.out.println("Integer Constructor B");
	}
}