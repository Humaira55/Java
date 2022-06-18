package Assignment_9;

public class rooftopCafeMain {

	public static void main(String[] args) {
		
		RooftopPoolCafe r1 = new RooftopCafeFactory().getResturant();
		
		
		if(r1 instanceof RustomCafe)
		{
			((RustomCafe) r1).RustomSpeciadDish();
		}
		else if(r1 instanceof BabarCafe)
		{
			((BabarCafe) r1).BabarSpecialOffer();
		}
		else {
			System.out.println("Sorry! This Cafe doesn't exist.");
		}
		
		r1.welcomeDrink();
		r1.biryani();
		r1.Role();
		r1.manchurian();
		r1.soup();
		r1.getClub();
		r1.getSwimmingPool();

	}

}
