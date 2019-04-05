package Array;

public class JaggedArray 
{

	public static void main(String[] args) 
	{
		int ar[][] = new int[3][];
		ar[0] = new int[4];
		ar[1] = new int[2];
		ar[2] = new int[3];
		
		int counter = 0;
		
		 //initializing array
	      for(int row=0; row < ar.length; row++)
	      {
	   
	         for(int col=0; col < ar[row].length; col++)
	         {
	            ar[row][col] = counter++;
	         }    
	      }

	      //printing array
	      for(int row=0; row < ar.length; row++)
	      {
	         System.out.println();
	         for(int col=0; col < ar[row].length; col++)
	         {
	            System.out.print(ar[row][col] + " ");
	         }    
	      }
	}

}
