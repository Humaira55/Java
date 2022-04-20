package Aggregation;

import java.util.Scanner;

class person{
	
	String name ;
	String surname;
	
	Address a1;
	
	person(String name,String surname,Address a1){
		this.name = name;
		this.surname=surname;
		this.a1=a1;
	}
	
	void personInfo()
	{
		System.out.println(name + " " + surname );
	a1.addressInfo();
	//	System.out.println(a1.houseNo + " "+ a1.laneName+ " "+a1.pincode+ " "+ a1.postal);
	}
}

class Address{
	int houseNo;
	String laneName;
	int pincode;
	int postal;
	
	Address(int houseNo,String laneName,int pincode,int postal){
		this.houseNo = houseNo;
		this.laneName=laneName;
		this.pincode=pincode;
		this.postal=postal;
	}
	
	void addressInfo()
	{
		System.out.println("Address is : " + houseNo + " " + laneName + " " + pincode + " " + postal);
	}
}
public class PersonAggregation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name = sc.nextLine();
		
		System.out.println("Enter the surname");
		String surname = sc.nextLine();
		
		System.out.println("Enter the House No.");
		int house = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter the Lane ");
		String lane = sc.nextLine();
		
		System.out.println("Enter the Pincode.");
		int pincode = sc.nextInt();
			
		System.out.println("Enter the Postal ");
		int postal = sc.nextInt();
		
		Address o1 = new Address(house,lane,pincode,postal);
		
		person p1 = new person(name,surname,o1);
		
		p1.personInfo();
//		p1.addressInfo();
	}

}
