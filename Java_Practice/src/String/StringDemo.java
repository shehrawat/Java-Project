package String;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		Student s1 = new Student(10,"Ajay");
		System.out.println(s1);
	}

}

class Student
{
	int roll;
	String name;
	
	public Student(int roll , String name)
	{
		this.roll = roll;
		this.name = name;
	}
	 	
	public String toString()	// Here is overriding 
	{
		return roll + " : " + name;
	}
}
