package Interface;

public class AbcImp implements Abc ,Pqr
{
	public void show()
	{
		System.out.println("This is Abc");
	}
	
	public void xyz()
	{
		System.out.println("This is Pqr");
	}
	
	public void display()
	{
		System.out.println("This is Abc");
	}
	
	public static void main(String[] args) 
	{
		Abc obj1 = new AbcImp();
		Abc obj2 = new AbcImp();
		obj2.show();
		obj1.show();
//		obj1.xyz();
//		obj.display();	// We can not call display because here reference is of Abc Interface and memory of Class AbcImp

	}

}
