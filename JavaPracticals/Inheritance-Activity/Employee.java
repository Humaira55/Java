package Inheritence_Activity;

public class Employee {
	
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowence = 250.80;
	double Hra = 1000.50;
	
	Employee()
	{
		
	}
	
	Employee(long id,String name, String address, long phone)
	{
		employeeId = id;
		employeeName = name;
		employeeAddress = address;
		employeePhone = phone;
	}
	
	double calculateSalary()
	{
		double salary;
		salary = basicSalary +(basicSalary * specialAllowence/100) + (basicSalary * Hra/100);
		return salary;
	}
	
	double calculateTransportAllowence()
	{
		double transportAllowence;
		transportAllowence = 10/100 * basicSalary;
		return transportAllowence;
	}

}
