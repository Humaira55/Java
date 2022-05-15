package Assignment_7;

public abstract  class Bike {
	Engine e1;
	Wheel w1;
	String name;
	
	Bike(String name,Engine e1, Wheel w1)
	{
		this.name = name;
		this.w1 = w1;
		this.e1 = e1;
		System.out.println("Bike Name : " + name );
	}

	abstract void start();
	abstract void  move();
	abstract void break1();
	abstract void stop();
}
