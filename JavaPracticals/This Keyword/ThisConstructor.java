
public class ThisConstructor {
	
	ThisConstructor()
	{
		System.out.println("Hello");
	}
	ThisConstructor(String n)
	{
		this();
		System.out.println(n);
	}

	public static void main(String[] args) {
		ThisConstructor c = new ThisConstructor("Humaira");

	}

}
