package Inheritence_Activity;

public class Manager extends Employee{
	
	Manager(long id,String name, String address, long phone, double salary)
	{
		super(id, name, address,phone);
		basicSalary =  salary;
	}
	
	double calculateTransportAllowence()
	{
		double transportAllowence;
		transportAllowence = 15*basicSalary/100;
		return transportAllowence;
	}
}
