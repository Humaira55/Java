package Assignment_7;

public class Suzuki extends Bike{
	
Suzuki(String name, Engine e1, Wheel w1) {
		super(name, e1, w1);
		// TODO Auto-generated constructor stub
	}

	void start() {
		System.out.println("Suzuki is Starting..");		
	}

	void move() {
		System.out.println("Suzuki is Moving..");				
	}

	void break1() {
		System.out.println("Suzuki gets the Break..");			
	}

	void stop() {
		System.out.println("Suzuki is Stoping..");			
	}


}
