
public class ThisMethod {
	
	void display()
	{
		System.out.println("Welcome to java");
	}
	
	void display1()
	{
		System.out.println("Welcome to PHP");
		this.display();
	}

	public static void main(String[] args) {
		ThisMethod m1 = new ThisMethod();
		m1.display1();

	}

}
