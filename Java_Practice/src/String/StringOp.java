package String;

import java.util.Scanner;

public class StringOp 
{

	public static void main(String[] args) 
	{
		String s1,s2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Strings : ");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		
		// Step 1
		int l1 = s1.length();
		int l2 = s2.length();
		
		System.out.println("String 1 Lenght is : "+l1);
		System.out.println("String 2 Lenght is : "+l2);
		
		// Step 2
		String s3 = s1+s2;				//s1.concat(s2); - We can add two string using concat method and add using + operator
		System.out.println("Result of concatenation is : "+s3);
		int l3 = s3.length();
		System.out.println("String 3 Lenght is : "+l3);
		
		// Step 3
		s1 = s1.toUpperCase();
		s2 = s2.toUpperCase();
		s3 = s3.toUpperCase();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
