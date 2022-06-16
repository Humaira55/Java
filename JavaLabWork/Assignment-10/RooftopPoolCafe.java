package Assignment_9;

public abstract class RooftopPoolCafe implements ChineeseResturant,IndianResturant,SwimmingPool,Club{

	CustomerName c;
	
	RooftopPoolCafe(CustomerName c)
	{
		this.c = c;
		System.out.println( "Welcome " + c.name + " in Rooftop Pool Cafe");
		System.out.println("Have a Nice Day!");
		System.out.println("");
	}
}
