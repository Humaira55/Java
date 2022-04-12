
public class ThisArgumentMethod {
	
	void display1(ThisArgumentMethod p)
	{
		System.out.println("Welcome");
	}
	
	void display2()
	{
		display1(this);
	}

	public static void main(String[] args) {
		
		ThisArgumentMethod c1 = new ThisArgumentMethod();
		c1.display2();
	}

}
