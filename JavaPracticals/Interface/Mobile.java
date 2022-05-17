package Interface;

public class Mobile implements Camera,Clock {
	
	void call()
	{
		System.out.println("Let's Call..");
	}
	
	void msg()
	{
		System.out.println("Let's Message..");
	}

	@Override
	public void getTime() {
		System.out.println("Let's see the time..");
		
	}

	@Override
	public void clickImg() {
		System.out.println("Let's Click the Images..");
		
	}

}
