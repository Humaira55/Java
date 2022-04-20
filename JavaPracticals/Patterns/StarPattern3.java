class StarPattern3
{
	
	StarPattern3()
	{
	System.out.println("default constructor");
	}

	public static void main(String args[])
	{
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("Enter the total number of line ..");

	int n = sc.nextInt();

	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
		System.out.print(j);
		}
	System.out.println();
	}

	new StarPattern3();

	}
}