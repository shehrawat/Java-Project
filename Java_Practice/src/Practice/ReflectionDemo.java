package Practice;

public class ReflectionDemo 
{

	public static void main(String[] args) throws Exception 
	{
////    :  Different ways of Instantiating (Creating Object) a class in Java		
//
////	1 - 
//		Test t = new Test();
//		t.show();
//		
//		Test obj;   // 2 -  Clone 
//					// 3 - De-Serialization
//					// 4 - Dependency injection   - In spring framework
		
		Class c = Class.forName("Practice.Test");
		Test t = (Test) c.newInstance();
		t.show();
	}
 
}
