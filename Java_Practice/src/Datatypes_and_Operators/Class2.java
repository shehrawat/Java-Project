package Datatypes_and_Operators;

public class Class2 {
	
//      : Data Types in java	
	// 	int - 4 bytes
	// 	float - 4 bytes
	// 	double - 8 bytes
	// 	char - 2 bytes
	
	// 	int:
	// 	short int - 2 bytes
	// 	long int - 8 bytes
	// 	byte - 1 bytes
	
	/* 	Java Runtime creates Stack memory to be used by main() method thread
	 	when it is found at line 1. At line 2, a primitive local variable is created,
	 	which is stored in the Stack memory of main() method. 
	 	Since an Object is created at line 3, it's created in Heap memory 
	 	and the reference for it is stored in Stack memory.*/
	
	/* 	Java has eight primitive types: byte , short , int , long , char , boolean , float and double .
	   Anything else is a non-primitive type.*/

	/* 	Non-primitive data types are not defined by the programming language,
	   	but are instead created by the programmer. They are sometimes called "reference variables,"
	   	or "object references," since they reference a memory location, which stores the data.*/
	
	/* 	Heap memory is used by all the parts of the application
	   	whereas stack memory is used only by one thread of execution.
	    Whenever an object is created, it's always stored in the Heap space
	    and stack memory contains the reference to it.*/
	
	// By default all decimal values in java are double
	
//  	-----------------------------------------------------------------------------------------------------	
	
	public static void main(String[] args) 
	{
//		: Conversion in java		
		
//		double a = 8.2;
//		double b = 2.8;
//		b=3.8;
//		
//		 float a = 8.2f;
//		 float b = 2.8f;
//		 b=3.8f;
		
//		char x = 'A';             
//		// ASCII value
//		// Type Casting : convert char to int
//		System.out.println((char)564);        // Output of a is : 65      
//		System.out.println((int)x);			  // Type Casting	
//		System.out.println((char)65);         // Type Casting
//		int a,b,c;
//		a=2;
//		b=5;
//		c=a+b;
//		
//		System.out.println("Sum of " +a +" and " +b +" is "  +c);
//		System.out.printf("Sum of %d and %d is %d",a,b,c);
//		-----------------------------------------------------------------------------------------------------
		
//		: Operators in java		
//		int i = 5;
//		
//		i += 3;    // i = i+3
//		i = i + 3;    // i = i+3
//		i -= 3;    // i = i-3
//		i *= 3;    // i = i*3
//		System.out.println(i);
//		
//		byte v = 5;
//		
////		v = v*2.5;           //double
//		v *= 2.5;		
//		System.out.println(v);
//		-----------------------------------------------------------------------------------------------------
		
//		: Binary Literal in java
		
//		int y = 0B100_00_00_00_00;
//		System.out.println(y);
// 		-----------------------------------------------------------------------------------------------------		
		
//		: Post Increment and Pre Increment
		
	
//		int i = 5;
//		i++;
//		
//		System.out.println(i);
	
//		int i = 5;
//		int j = i++;            //        --> Post Increment
////		int j = ++i;            // i + 1  --> Pre Increment
//		
//		System.out.println(j +" : "+ i);
	
//		int i = 5;
//		int temp;
//		temp = i;
//		i++;
//		i = temp;
//		
//		i = i++;
//		
//		System.out.println(i);
//      -----------------------------------------------------------------------------------------------------		
//		: Bitwise And & Or | Operator in Java
		
//		& 1 1 -> 1
//		& 1 0 -> 0
//		& 0 0 -> 0
//		| 0 0 -> 0		
//		| 1 0 -> 1
//		| 1 1 -> 1
		
//		int a = 25; //	 1 1 0 0 1
//		int b = 15; //	 0 1 1 1 1
//					// & 0 1 0 0 1 -> 9
//					// | 1 1 1 1 1 -> 31
//		int c = a & b;
//		int d = a | b;
//		
//		System.out.println(c);
//		System.out.println(d);
//      -----------------------------------------------------------------------------------------------------		

//		: Left shift and Right shift operator...
		
//		int a = 8; 		// 1 0 0 0 0
//		
//		int b = a << 2;	// 1 0 0 0 0 0 0 ->32
//		
//		int c = a >> 2;	// 1 0 -> 2
//		
//		System.out.println(b);
//		System.out.println(c);
//      -----------------------------------------------------------------------------------------------------		

//		: how to use Boolean in java		
	
//		boolean a = true;
//		a = !a;
//		
//		System.out.println(a);
//      -----------------------------------------------------------------------------------------------------		

	
	}
	

}
