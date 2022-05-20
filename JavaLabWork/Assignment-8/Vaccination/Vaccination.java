package Assignment_8;

import java.util.Scanner;

public class Vaccination {
	
	static void checkNationality(String n) throws Nationality, NotEligible
	{
		String lower = n.toLowerCase();
		if(lower=="indian" || lower=="india")
		{
			checkGender();
		}
		else {
			throw new Nationality();
		}
	}
	
	static void checkGender() throws NotEligible
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Gender");
		String gender = sc.nextLine().toLowerCase();
		if(gender=="male")
		{
			System.out.println("Enter Age : ");
			int age = sc.nextInt();
			if(age>60)
			{
				System.out.println("Welcome, You are Eligible for the Doze");
			}
			else {
				throw new NotEligible();
			}
		}
		else if(gender=="female")
		{
			System.out.println("Enter Age : ");
			int age = sc.nextInt();
			if(age>50)
			{
				System.out.println("Welcome, You are Eligible for the Doze");
			}
			else {
				throw new NotEligible();
			}
		}
		else {
			System.out.println("Please Enter Correct Gender");
		}
	}

	public static void main(String[] args) throws Nationality, NotEligible{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Nationality :");
		String nat = sc.nextLine();	
		checkNationality(nat);

	}

}
