package Encapsulation;

class Rect {
	
	private int length;
	private int breadth;
	
	public void setLength(int length)
	{
		if(length<=10)
		{
			this.length = 10;
		}
		else if(length >= 100)
		{
			this.length = 100;
		}
		else {
			this.length = length;
		}	
	}
	
	public void setBreadth(int breadth)
	{
		if(breadth <= 5)
		{
			this.breadth = 5;
		}
		else if(breadth >= 50 )
		{
			this.breadth = 50;
		}
		else {
			this.breadth = breadth;
		}		
	}
	
	public int getLength()
	{
		return length;
	}
	
	public int getBreadth()
	{
		return breadth;
	}
	
	public int calculate()
	{
		return length * breadth;
	}

}

public class Rectangle{
	public static void main(String args[])
			{
				Rect r1 = new Rect();
				r1.setLength(8);
				r1.setBreadth(60);
				r1.getLength();
				r1.getBreadth();
				
				Rect r2 = new Rect();
				r2.setLength(85);
				r2.setBreadth(10);
				r2.getLength();
				r2.getBreadth();
				
				Rect r3 = new Rect();
				r3.setLength(105);
				r3.setBreadth(35);
				r3.getLength();
				r3.getBreadth();
				
				System.out.println(r1.calculate());
				System.out.println(r2.calculate());
				System.out.println(r3.calculate());
			}
}
