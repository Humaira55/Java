package Assignment_9;

public class rooftopCafeMain {

	public static void main(String[] args) {
		
		RooftopPoolCafe r1 = new RooftopCafeFactory().getResturant();
		
		r1.welcomeDrink();
		r1.biryani();
		r1.Role();
		r1.manchurian();
		r1.soup();
		r1.getClub();
		r1.getSwimmingPool();
		
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

	}

}

//OUTPUT :
//	In which Resturant you wanted to go ?
//			BABAR
//			Enter your Name : 
//			HUMAIRA
//			Welcome HUMAIRA in Rooftop Pool Cafe
//			Have a Nice Day!
//
//			-----MENU-----
//			Cold Water
//			Chicken Tikka Biryani
//			Veg Role
//			Dry Manchurian + Gravy Manchurian
//			Hot and Sour Soup
//			You can enjoy in Club
//			You can enjoy in Swimming Pool
//			This Month 30% Discount on every Friday

