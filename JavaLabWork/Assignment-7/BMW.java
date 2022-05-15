package Assignment_7;

public class BMW extends Bike{
BMW(String name, Engine e1, Wheel w1) {
		super(name, e1, w1);
		// TODO Auto-generated constructor stub
	}

	void start() {
		System.out.println("BMW is Starting..");		
	}

	void move() {
		System.out.println("BMW is Moving..");		
	}

	void break1() {
		System.out.println("BMW gets the Break..");	
	}

	void stop() {
		System.out.println("BMW is Stoping..");		
	}

}
