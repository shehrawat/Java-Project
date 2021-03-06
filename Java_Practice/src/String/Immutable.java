package String;

import java.util.Scanner;

public class Immutable 
{

	public static void main(String[] args) 
	{
		String str = "Ajay";	// In Heap memory -> In String Pool str is save as AJay in 101 address
/*																										But reference is saved in stack memory as 
 * 																										str | 101 and str1 | 101               */
		
		String str1 = "Ajay";	// In Heap memory -> In String Pool str1 is save as AJay in 101 address 
		
		str = "Singh";			// In Heap memory -> In String Pool str is save as Singh in 103 address 
//									and reference is saved in stack memory as str | 103 and replace the address str | 101 to str | 103
		
								// Thats why String is immutable because you cannot change its value. Once you have defined the string you cannot change it
		
								// Every time when you changing the value of str you actual creating new object you are not changing the existing value
		
		String s1 = new String("Ajay");	// It uses the memory of String Pool	// It uses the 101 | Ajay
		
		 String original;
		 String reverse;
		 
		 System.out.println("Please enter a String");
			Scanner obj=new Scanner(System.in);
			original=obj.nextLine();
			reverse=original.concat(" Shehrawat");
			System.out.println(reverse);
		}
}

