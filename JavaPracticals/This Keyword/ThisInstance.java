
public class ThisInstance {

	int pincode;
	String city;
	ThisInstance(int pincode,String city)
	{
		this.pincode = pincode;
		this.city = city;
	}
	
	void display()
	{
		System.out.println(pincode + " " +city);
		
	}

	public static void main(String[] args) {
		
		CopyConst1 c1 = new CopyConst1(4005, "Mumbai");
		CopyConst1 c2 = new CopyConst1(1994, "Pune");
		c1.display();
		c2.display();
	}
}
