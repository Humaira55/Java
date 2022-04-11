package Assignment_2;

public class Salary extends Employee {
	
	int salary;
	String designation;
	
	Salary(int emp_id, String name, int salary,String designation)
	{
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	
	void display()
	{
		if(salary>20000)
		{
			System.out.println(emp_id +" "+ name +" "+ salary +" "+designation );
		}
	}

	public static void main(String[] args) {
		Salary s1 = new Salary(1, "shifa", 35000, "Manager");
		Salary s2 = new Salary(2, "Kashaf", 15000, "Executive");
		Salary s3 = new Salary(3, "Aman", 21000, "Finance");
		s1.display();
		s2.display();
		s3.display();

	}

}
