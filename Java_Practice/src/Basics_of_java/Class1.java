package Basics_of_java;

public class Class1 {
	String a = "";
	String b = "";
	static int i = 10;

	public void abc(String b) 
	{
		a = b;
	}

	public static void main(String[] args) {
		Class1 obj = new Class1();
		obj.abc("Ajay");
		System.out.println(obj.a);
		System.out.println(i);
	}
}
