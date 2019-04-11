package ObjectClonning;

public class Clonning 
{

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Abc obj = new Abc();
		obj.i = 5;  // -> i = 5
		obj.j = 6;	// -> j = 6
		
		Abc obj1 = (Abc)obj.clone();
		System.out.println(obj1);
		System.out.println(obj);
		
	}

}

class Abc implements Cloneable
{
	int i;
	int j;
	
	@Override
	public String toString()
	{
		return "Abc{" + "i=" + i + ", j=" + j + '}';
		
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
