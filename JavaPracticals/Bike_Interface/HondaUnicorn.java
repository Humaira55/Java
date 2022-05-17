package Bike_Interface;

public class HondaUnicorn implements Bike {

	@Override
	public void start() {
		System.out.println("unicorn starts ");
		
	}

	@Override
	public void move() {
		System.out.println("unicorn moves ");
		
	}

	@Override
	public void stop() {
		System.out.println("unicorn stops ");
		
	}

}

