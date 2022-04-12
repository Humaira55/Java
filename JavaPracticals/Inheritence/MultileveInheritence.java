class MyParent
{
	int a = 30;
	int b= 20;
}

class Child extends MyParent
{
	int add=0;
	void disp1()
	{
		add = a+b;
		System.out.println("Addition of nember is : "+ add);
	}	
}

class Grandchild extends Child
{
	void disp2()
	{
		int avg = add/2;
		System.out.println("Average of Number is :" + avg);
	}	
}
public class MultileveInheritence {

	public static void main(String[] args) {
		Grandchild c1 = new Grandchild();
		c1.disp1();
		c1.disp2();

	}

}
