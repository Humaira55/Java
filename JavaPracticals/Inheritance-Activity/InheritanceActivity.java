package Inheritence_Activity;

public class InheritanceActivity {

	public static void main(String[] args) {
		
		
		
		Manager m1 = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		System.out.println("The Transport Allowence of Manager is " + m1.calculateTransportAllowence());
		System.out.println("The Salary of Manager is " + m1.calculateSalary());
		
		Trainee t1 = new Trainee(29864, "Jack", "Mumbai India", 442085, 45000);
		System.out.println("The Transport Allowence of Trainee is " + t1.calculateTransportAllowence());
		System.out.println("The Salary of Trainee is " + t1.calculateSalary());

	}

}
