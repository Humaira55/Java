package Assignment_2;

public class Employee1 {
	String empname;
	int empsalary;
	String emplocation;
	
	Employee1(String name)
	{
		this.empname = name;
	}
	Employee1(String name, int salary)
	{
		this(name);
		this.empsalary = salary;
	}
	Employee1(String name, int salary, String location)
	{
		this(name,salary);
		this.emplocation = location;
	}
	void display()
	{
		System.out.println("Employee name : "+empname);
		System.out.println("Employee Salary : "+empsalary);
		System.out.println("Employee Location : "+emplocation);
	}

	public static void main(String[] args) {
		Employee1 e1 = new Employee1("Javed", 12000, "Bandra");
		e1.display();
	}

}
