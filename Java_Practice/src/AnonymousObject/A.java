package AnonymousObject;

public class A 
{
	int i;
	public void show()
	
	{
		System.out.println(i);
	}

	public static void main(String[] args) 
	{
//		A obj = new A();	/* A obj = new A() - It is Reference Object - It take space both in Stack and Heap Memory 
//					    		When you want use object only 1 time then use Anonymous Object */

		//		new A().show();		
		/* 		new A() - It is Anonymous Object  - It take space only in Heap Memory and it is elgible for 
							   garbage collection because we dont have any reference
							   When you want use object only 1 time then use Anonymous Object because it creates
							   every time new object in heap memory  */
		
		new A() .i= 25;  
		new A().show();  // Output is 0
		
		A obj = new A();
		obj.i = 25;
		obj.show();     // // Output is 25
	}

}
