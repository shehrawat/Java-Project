package Interface;

public class C extends StreamApi implements I
{
	public static void main(String[] args) 
	{
		C objc = new C();
		objc.show();		// Third rule in Java - It gives output of Class C show because Class has more power than Interface. It hid show method of interface
	}
}
