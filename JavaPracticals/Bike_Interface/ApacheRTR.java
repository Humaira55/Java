package Bike_Interface;

public class ApacheRTR implements Bike {

	@Override
	public void start() {
		System.out.println("ApacheRTR starts ");
		
	}

	@Override
	public void move() {
		System.out.println("ApacheRTR moves ");
		
	}

	@Override
	public void stop() {
		System.out.println("ApacheRTR stops ");
		
	}
	
	

}
