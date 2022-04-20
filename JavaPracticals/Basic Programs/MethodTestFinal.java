class MethodTestFinal
{
		public static void main(String[] args)
		{
		//MethodTestFinal m1=new MethodTestFinal();

		System.out.println ( new MethodTestFinal().m1(101,"Humaira"));

		new MethodTestFinal().m1("soukhya");

		//System.out.println (m1.m1(101,"Humaira"));

		new MethodTestFinal().m1(929);

		
		}
// -----------------------------------
	void m1(int n)
	{
	System.out.println("void method with one int argument");
	System.out.println(n);
	}
// -----------------------------------
	void m1(String s)
	{
	System.out.println("void method with one string argument");
	System.out.println(s);
	}
// -----------------------------------
/*	void m1(int a, String s)
	{
	System.out.print("void method with two argument ( int & string )");
	}
*/
// -----------------------------------
	int m1(int a, String s)
	{
	System.out.println("int method with two argument and the value of int argument is " + a);
	System.out.println("int method with two argument and the value of String argument is " + s);
	return 10001;
	}
// -----------------------------------
	int m1()
	{
	System.out.print("int method with one int argument");
	return 118;
	}
// -----------------------------------
	int m1(String s, int a)
	{
	System.out.print("int method with two argument ( string & int )");
	return a;
	}
// -----------------------------------
	int m1(int n,int m)
	{
	System.out.print("int method with two argument ( int  & int )");
	return n;
	}
// -----------------------------------

}