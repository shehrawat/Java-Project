package Scanner;

import java.util.Scanner;

public class ScannerClass 
{

	public static void main(String[] args) 
	{
		String str = "";
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		str = sc.nextLine();
		i = sc.nextInt();
		
		//i = Integer.parseInt(sc.nextLine()); 	// Convert String value to Integer value
		
		System.out.println("String is : "+str);
		System.out.println("I is : "+ i);
		
	}

}
