package Datatypes_and_Operators;

public class Class1 {
	
	String a = "";
	
	public void abc(String b)
	{
		a = b;
		this.xyz();
	}
	
	public void xyz()
	{
		System.out.println("Singh");
	}

	public static void main(String[] args) 
	{
		Class1 obj = new Class1();
		obj.abc("Ajay");
		System.out.println(obj.a);
		System.out.println("Hello World");
	}
}
