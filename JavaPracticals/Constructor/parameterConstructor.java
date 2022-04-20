public class parameterConstructor {
	int id;
	String name;
	String city;
	static String div="A";
	static String classn="BCA";
	
	parameterConstructor(int n,String m)
	{
		id=n;
		city=m;
	}
	
	void display()
	{
		System.out.println("....." + id + ".....");
		System.out.println(name + " " + city);
		System.out.println(div + " " + classn);
	}

	public static void main(String[] args) {
		parameterConstructor s1 = new parameterConstructor(101, "Shifa");
		parameterConstructor s2 = new parameterConstructor(102, "Iram");
		parameterConstructor s3 = new parameterConstructor(103, "Ayesha");
		s1.display();
		s2.display();
		s3.display();
		
	}

}
