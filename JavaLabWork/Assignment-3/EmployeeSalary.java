package Assignment_3;

import java.util.Scanner;

public class EmployeeSalary {
//	static int avg = 10000;
//	static int e1 = 11000;
//	static int e2 = 5000;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Average Salary : ");
		int avg = sc.nextInt();
		System.out.println("Enter the Salary of First Employee : ");
		int e1 = sc.nextInt();
		System.out.println("Enter the Salary of Second Employee : ");
		int e2 = sc.nextInt();
		
		int e3 = 3*avg -(e1 + e2) ;
		System.out.println("The Third employee will earn " + e3);
		}

}

//Output:
//
//Enter the Average Salary : 10000
//Enter the Salary of First Employee : 11000
//Enter the Salary of Second Employee : 5000
//The Third employee will earn 14000
