package Loops;

public class Class1 
{

	public static void main(String[] args) 
	{
//		for(int i=1;i<=4;i++)
//		{
//			
//			for(int j=1;j<=4;j++) 
//			{
//				if(i==3)
//					break;      // unlabeled Break statement - It will only break the inner loop
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}
		ajay:
		for(int i=1;i<=4;i++)  // This is for row
		{
			
			for(int j=1;j<=4;j++)   // // This is for column 
			{
				if(i==3)
					break ajay;      // labeled Break statement - It will break the outer loop
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}

}
