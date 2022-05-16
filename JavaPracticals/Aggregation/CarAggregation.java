package Aggregation;
import java.util.Scanner;

class Car{
String name;
	
	int carNo;
	
	Engine e1;
	
	Car(String name,Engine e1, int carNo)
	{
		this.name=name;
		this.e1=e1;
		this.carNo=carNo;
		System.out.println("CAR DATA : " + " The number of " + name + " car is :" + this.carNo);
	}
	
	void carStart()
	{
		e1.engineStart();
		System.out.println(name + " car is starting ...!");
	}
	
	void carMove()
	{
		System.out.println(name + " car is moving ...!");
	}
	
	void carStop() 
	{
		e1.engineStop();
		System.out.println(name + " car is stopping ...!");
	}
}

class Driver{
	String driverName;
	String licenseNo;
	
	Driver(String driverName,String licenseNo)
	{
		this.driverName=driverName;
		this.licenseNo=licenseNo;
		System.out.println("Driver Data :"+ "Name is :"+driverName + " and License no is :"+ licenseNo);
	}
	
	void drive(Car c)
	{
		c.carStart();
		c.carMove();
		c.carStop();
	}
}

class Engine{
	String typeofengine;
	double hp;
	
	Engine(String typeofengine,double hp)
	{
		this.typeofengine=typeofengine;
		this.hp=hp;
		System.out.println("ENGINE DATA : Name of the object and Horsepower " + this.typeofengine + " "+this.hp);
	}

	void engineStart()
	{
		System.out.println("Engine is starting to start the : "+ typeofengine);
	}
	
	
	void engineStop()
	{
		System.out.println("Engine is stoping for the :"+ typeofengine);
	}
}

public class CarAggregation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the car name : ");
		String carname=sc.nextLine();
		
		System.out.println("Enter the car number : ");
		int carno=sc.nextInt();
		
		System.out.println("-------------------");
		
		System.out.println("Enter the engine horsepower : ");
		double hp=sc.nextDouble();
		
		sc.nextLine();
		System.out.println("-------------------");
		
		Engine obj1= new Engine(carname,hp);	
		
		Car c1= new Car(carname, obj1,carno);
		
		System.out.println("-------------------");
		
		System.out.println("Enter driver name : ");
		String dname=sc.nextLine();
		
		System.out.println("Enter license no :");
		String lno=sc.nextLine();
		
		System.out.println("-------------------");
		
		Driver d1=new Driver(dname, lno);
		
		d1.drive(c1);
		
		sc.close();

	}

}
