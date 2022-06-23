package Assignment_11;

import java.util.Scanner;

public class Rectangle {
	
	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth) throws LengthException, BreadthException {
		super();
		this.setLength(length);
		this.setBreadth(breadth);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) throws LengthException {
		if(length<10 || length>50)
		{
			throw new LengthException();
		}
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) throws BreadthException {
		if(breadth<5 || breadth>20)
		{
			throw new BreadthException();
		}
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Area of Rectangle is : " + getBreadth()*getLength() ;
	}

	public static void main(String[] args) {
		
		try {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length : ");
		int len = sc.nextInt();
		
		System.out.println("Enter Breadth : ");
		int br = sc.nextInt();
		
		
		Rectangle r1 = new Rectangle(len, br);
		System.out.println(r1);
		} catch (LengthException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (BreadthException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		

	}

}

//Output:
//	Enter length : 
//		10
//		Enter Breadth : 
//		5
//		Area of Rectangle is : 50
