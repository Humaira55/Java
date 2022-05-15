package Assignment_7;

public class Rider {
	
	String riderName;
	int licenseNo;
	
	Rider(String riderName, int licenseNo)
	{
		this.riderName = riderName;
		this.licenseNo = licenseNo;
		System.out.println("The Rider Name is : " +riderName + " and License No is : " + licenseNo);
	}	
		void ride(Bike b)
		{
			b.start();
			b.move();
			b.break1();
			b.stop();			
		}

}
