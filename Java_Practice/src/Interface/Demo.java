package Interface;

public class Demo implements P
{
	public void show()
	{
		System.out.println("Hello");
	}

	public static void main(String[] args) 
	{
		Demo obj = new Demo();
		
		if(obj instanceof P)
			obj.show();
		else
			System.out.println("No Permision");
	}

}

interface P		// This is Marker Interface because it has no any method
{
	
}

// Marker Interface is used in many places like Serializable, Remote, Google Search

/* -> Serialization is a mechanism of converting the state of an object into a byte stream.
   -> Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. ...
  	  To make a Java object serializable we implement the java.io.Serializable interface.*/
 