package Assignment_9;

public class RustomCafe extends RooftopPoolCafe{


	RustomCafe(CustomerName c) {
		super(c);
		System.out.println("-----MENU-----");
	}

	@Override
	public void soup() {
		System.out.println("Hot and Sour Soup + Noodles Soup");
		
	}

	@Override
	public void manchurian() {
		System.out.println("Gravy Manchurian");
		
	}


	@Override
	public void welcomeDrink() {
		System.out.println("Cold Water + Lemon Juice");
		
	}

	@Override
	public void biryani() {
		System.out.println("Hot and Sour Soup");
		
	}

	@Override
	public void Role() {
		System.out.println("Veg Biryani");
		
	}

	@Override
	public void getSwimmingPool() {
		System.out.println("You can enjoy in Swimming Pool");
		
	}

	@Override
	public void getClub() {
		System.out.println("You can enjoy in Club");
		
	}
	
	void RustomSpeciadDish()
	{
		System.out.println("Today,s Special Dish is Butter Chicken");
	}
	

}
