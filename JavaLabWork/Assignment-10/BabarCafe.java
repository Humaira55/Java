package Assignment_9;

public class BabarCafe extends RooftopPoolCafe{

	BabarCafe(CustomerName c) {
		super(c);
		System.out.println("-----MENU-----");
	}

	@Override
	public void soup() {
		System.out.println("Hot and Sour Soup");
		
	}

	@Override
	public void manchurian() {
		System.out.println("Dry Manchurian + Gravy Manchurian");
		
	}


	@Override
	public void welcomeDrink() {
		System.out.println("Cold Water");
		
	}

	@Override
	public void biryani() {
		System.out.println("Chicken Tikka Biryani");
		
	}


	@Override
	public void Role() {
		System.out.println("Veg Role");
		
	}
	

	@Override
	public void getSwimmingPool() {
		System.out.println("You can enjoy in Swimming Pool");
		
	}

	@Override
	public void getClub() {
		System.out.println("You can enjoy in Club");
		
	}
	
	void BabarSpecialOffer()
	{
		System.out.println("This Month 30% Discount on every Friday");
	}
	

}
