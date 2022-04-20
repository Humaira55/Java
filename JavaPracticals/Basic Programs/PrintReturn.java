
public class PrintReturn {
	static void m1()
	{
		System.out.println("m1 method");
	}
	
	static int m2()
	{
		System.out.println("m2 method");
		return 1;
	}

	public static void main(String[] args) {
		PrintReturn.m1();
		System.out.println(PrintReturn.m2());
		
	}
}
