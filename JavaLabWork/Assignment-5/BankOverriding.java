package Assignment_4;

import java.util.Scanner;

class Bank{
	
	String bankName="SBI";
	String location="Mumbai";
	
	void display()
	{
		System.out.println("Bank name : " + bankName);
		
		System.out.println("Bank Location : " + location);
	}
}

class Bank1 extends Bank{
	
	String bankName="HDFC";
	String location="Pune";
		
	void display()
	{
		System.out.println("Bank name : " + bankName);
		
		System.out.println("Bank Location : " + location);
	}
}

class Bank2 extends Bank{
	
	String bankName="Kotak";
	String location="Nagpur";
		
	void display()
	{
		System.out.println("Bank name : " + bankName);		
		System.out.println("Bank Location : " + location);
	}
}

public class BankOverriding {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		Bank1 b1 = new Bank1();
		Bank2 b2 = new Bank2();
		b.display();
		b1.display();
		b2.display();
	}

}
