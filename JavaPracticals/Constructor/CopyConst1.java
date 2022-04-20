
public class CopyConst1 {
	int pincode;
	String city;
	CopyConst1(int p,String c)
	{
		pincode = p;
		city = c;
	}
	CopyConst1(CopyConst1 a)
	{
		pincode = a.pincode;
		city = a.city;	
	}
	void display()
	{
		System.out.println(pincode + " " +city);
		
	}

	public static void main(String[] args) {
		
		CopyConst1 c1 = new CopyConst1(4005, "Mumbai");
		CopyConst1 c2 = new CopyConst1(c1);
		c1.display();
		c2.display();
	}

}
