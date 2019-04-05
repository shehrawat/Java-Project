package Interface;

interface Rst
{
	void show();
}

public class Lmn 
{
	
	public static void main(String[] args) 
	{
		Rst obj = new Rst() 	// This is Anonymous Class
		{
			public void show()
			{
				System.out.println("In Show");
			}
		};
		obj.show();
	}
	
}

/* Types Of Interface 
 * 
 * 1- Marker Interface -> Without any method
 * 2- SAM -> Single Abstract Method -> Functional Interface
 * 3- Normal Interface - 
 * */
		



