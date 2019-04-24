package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListFinalDemo 
{

	public static void main(String[] args) 
	{
		List<Student> studs = new ArrayList<>();
		studs.add(new Student(1,55));
		studs.add(new Student(2,95));
		studs.add(new Student(3,35));
		studs.add(new Student(4,45));
		studs.add(new Student(5,85));
		
		for(Student obj : studs)
		System.out.println(obj);
	}

}

class Student
{
	int rollno;
	int marks;
	
	public Student(int rollno , int marks)
	{
		this.rollno = rollno;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + "]";
	}
	
	
}