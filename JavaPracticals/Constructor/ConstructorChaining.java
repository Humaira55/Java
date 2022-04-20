
public class ConstructorChaining {
	
	int id;
	String name;
	String dept;
	ConstructorChaining(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	ConstructorChaining(int id,String name, String dept)
	{
		this(id,name);
		this.dept = dept;
	}
	
	void display()
	{
		System.out.println(id + " " + name + " " + dept);
	}

	public static void main(String[] args) {
		
		ConstructorChaining p = new ConstructorChaining(1, "Humaira", "IT");
		p.display();
	}

}
