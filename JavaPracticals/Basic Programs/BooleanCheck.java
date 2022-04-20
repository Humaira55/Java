class BooleanCheck
	{

	static int n;
	static String s;
	static boolean b;

	public static void main( String args[])
		{
		System.out.println(n);  // 0
		System.out.println(s);  // null
		System.out.println(b);  // false

		n=10;
		s="Airoli";
		b=true;

		if(n==10)
		{
		System.out.println("okk " + n);
		}

		if(s=="Airoli")
		{
		System.out.println("okk " + s);
		}

		if(b)  // if(b=true)
		{
		System.out.println("okk " + b);
		}
	
		}
	}
		