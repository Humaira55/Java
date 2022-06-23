package Assignment_11;

import java.util.Arrays;
import java.util.Comparator;


public class Student{
	
	String name;
	int roll_no;
	String subject;
	int total_marks;

	public Student(String name, int roll_no, String subject, int total_marks) {
		super();
		this.name = name;
		this.roll_no = roll_no;
		this.subject = subject;
		this.total_marks = total_marks;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_no=" + roll_no + ", subject=" + subject + ", total_marks="
				+ total_marks + "]";
	}


	private static Student[] StudentArray()
	{
		Student s1 = new Student("Minal", 12, "Java", 87); 
		Student s2 = new Student("Aiman", 26, "Maths", 62); 
		Student s3 = new Student("Fiza", 02, "C++", 93); 
		Student s4 = new Student("Riya", 22, "PHP", 55); 
		
		Student[] arr = {s1, s2, s3, s4};
		return arr;
	}


	public static void main(String[] args) {

	Student[] arr = StudentArray();
	
	Arrays.sort(arr, new name_Comparator());
	
	for(Student s : arr)
	{
		System.out.println(s + " ");
		
	}		

	}

}
