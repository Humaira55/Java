package Assignment_14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int x;
		
		ArrayList<Employee> a1 = new ArrayList<Employee>();
		
		try {
			
			do {
				
				System.out.println("Enter Employee id : ");
				int id = sc1.nextInt();
				System.out.println("Enter Employee Name : ");
				String name = sc2.nextLine();
				System.out.println("Enter Employee Department : ");
				String dept = sc2.nextLine();
				
				Employee e = new Employee(id,name,dept);
				a1.add(e);
				
				System.out.println("For Adding more Employees press 1");
				System.out.println("For quit press 0");
				x = sc1.nextInt();
				
				if(x==0)
				{
					System.out.println("Thankyou!");
				}
				else if(x!=1)
				{
					throw new EmployeeInputException();
				}
			}while(x==1);
		}
		catch(EmployeeInputException e)
		{
			System.out.println();
		}
		
		HashSet<Employee> h = new HashSet<Employee>(a1);
		
		Iterator itr = h.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
