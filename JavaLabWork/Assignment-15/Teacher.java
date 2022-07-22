package Assignment_15;

import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Scanner;

public class Teacher {
	
	private String name;
	private String subject;

	public Teacher(String name, String subject) {
		this.setName(name);
		this.setSubject(subject);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, subject);
	}

	@Override
	public boolean equals(Object obj) {
		Teacher other = (Teacher) obj;
		return Objects.equals(name, other.name) && Objects.equals(subject, other.subject);
	}

	@Override
	public String toString() {
		return "Teacher [Name=" + getName() + ", Subject=" + getSubject() + "]";
	}

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);	
		Scanner sc2 = new Scanner(System.in);
		
		LinkedHashMap<Teacher,String> map = new LinkedHashMap<Teacher,String>();
		int res;
		
		try {
			
			do {
				
				System.out.println("Enter Name : ");
				String name = sc1.nextLine();
				System.out.println("Enter Subject : ");
				String subject = sc1.nextLine();
				System.out.println("For adding more Teacher press 1 ");
				System.out.println("For quit press 0 ");
				res = sc2.nextInt();
						
				Teacher t = new Teacher(name, subject);
				
				map.put(t, name);
				
				if(res == 0)
				{
					System.out.println("Thank you!");
				}
				else if(res!=1)
				{
					throw new TeacherInputException();
				}			
				
			}while(res==1);
			
			System.out.println();
			System.out.println(map);
			
			do {
				System.out.println();
				System.out.println("If you wanted to remove any Teacher press 1");
				System.out.println("For quit press 0 ");
				res = sc2.nextInt();
				if(res == 0)
				{
					throw new TeacherQuitException();
				}
				else if(res!=1)
				{
					throw new TeacherInputException();
				}
				
				System.out.println("Enter name : ");
				String name = sc1.nextLine();
				System.out.println("Enter Subject : ");
				String subject = sc1.nextLine();
				
				Teacher s = new Teacher(name,subject);
				
				if(map.containsKey(s))
				{
					map.remove(s);
				}
				else {
					System.out.println("Data not Available");
				}
				
				
			}while(res==1);
			
		}catch(TeacherInputException | TeacherQuitException e)
		{
			System.out.println();
		}
		finally
		{
			sc1.close();
			sc2.close();
		}
		
		System.out.println(map);
			
			

	}

}
