
public class ConstructorChaining1 {
	
	int id;
	String name;
	
	ConstructorChaining1()
	{
		this(1, "Humaira");
		System.out.println("Default Constructor");
	}
	
	ConstructorChaining1(int id, String name)
	{
		
		System.out.println(id + "  " + name);
	}

	public static void main(String[] args) {
		ConstructorChaining1 p1 = new ConstructorChaining1();
	}

}
